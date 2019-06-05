package moe.ai.nlp.turing.web.controller.api;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import moe.ai.nlp.turing.base.controller.BaseApiController;
import moe.ai.nlp.turing.base.result.MessageResult;
import moe.ai.nlp.turing.base.result.ResultCode;
import moe.ai.nlp.turing.constant.TuringApiGlobalConstant;
import moe.ai.nlp.turing.model.Record;
import moe.ai.nlp.turing.model.User;
import moe.ai.nlp.turing.model.api.SendMessage;
import moe.ai.nlp.turing.service.IRecordService;
import moe.ai.nlp.turing.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.sql.Timestamp;

/**
 * Turing API 微服务
 */
@RestController
public class TuringApiController extends BaseApiController {

    final static int SEND_TYPE = 0;
    final static int RECEIVE_TYPE = 1;

    @Autowired
    IRecordService recordService;

    // TODO: RequestBody为空 400错误
    @RequestMapping(value = "/send", produces = "application/json; charset=utf-8")
    public Object sendPost(@RequestBody SendMessage sendMessage, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 返回错误
            return MessageResult.failure(ResultCode.TURING_SEND_ERROR);
        }
        if (sendMessage != null) {
            // 将前端发送的数据设置 ApiKey 与 UserId
            sendMessage.setUserInfo(new SendMessage.UserInfoBean(TuringApiGlobalConstant.API_KEY, TuringApiGlobalConstant.USER_ID));
            // 设定后的对象转为 JSONObject 类型
            JSONObject json = JSONObject.parseObject(new Gson().toJson(sendMessage));
            saveRecord("kangkang", json.toJSONString(), SEND_TYPE);
            try {
                // 调用第三方 API ，得到返回 JSON 内容
                return MessageUtil.getReplyJson(TuringApiGlobalConstant.API_URL, json, "utf-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return MessageResult.failure(ResultCode.TURING_SEND_ERROR);
    }

    public void saveRecord(String username, String json, int type) {
        Record record = new Record(username, new Timestamp(System.currentTimeMillis()),
                json, type);
        recordService.saveRecord(record);
    }
}
