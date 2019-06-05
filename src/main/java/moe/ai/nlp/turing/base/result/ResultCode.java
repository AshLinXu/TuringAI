package moe.ai.nlp.turing.base.result;

import lombok.AllArgsConstructor;

/**
 * 结果代码返回类
 */
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    USER_LOGIN_ERROR(500201, "登陆失败，用户名或密码出错，请重新登录"),
    TURING_SEND_ERROR(500301, "发送信息失败，请重试"),
    TURING_SEND_MATCH_ERROR(500302, "不支持的类型请求");

    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}