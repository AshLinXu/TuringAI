package moe.ai.nlp.turing.base.result;

import lombok.Data;

@Data
public class MessageResult<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> MessageResult<T> failure() {
        MessageResult<T> messageResult = new MessageResult<T>();
        messageResult.setResultCode(ResultCode.FAIL);
        return messageResult;
    }

    public static <T> MessageResult<T> failure(ResultCode resultCode) {
        MessageResult<T> messageResult = new MessageResult<T>();
        messageResult.setResultCode(resultCode);
        return messageResult;
    }

    public static <T> MessageResult<T> failure(ResultCode resultCode, T data) {
        MessageResult<T> messageResult = new MessageResult<T>();
        messageResult.setResultCode(resultCode);
        messageResult.setData(data);
        return messageResult;
    }

    public static <T> MessageResult<T> success() {
        MessageResult<T> messageResult = new MessageResult<T>();
        messageResult.setResultCode(ResultCode.SUCCESS);
        return messageResult;
    }

    public static <T> MessageResult<T> success(ResultCode resultCode) {
        MessageResult<T> messageResult = new MessageResult<T>();
        messageResult.setResultCode(resultCode);
        return messageResult;
    }

    public void setResultCode(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
}
