package com.tapdata.apidemo.common;

/**
 * 业务异常（记录日志并将错误消息提示给用户）
 *
 */
public class ServiceException extends BaseException {

    private static final long serialVersionUID = 1L;

    /**
     * 根据错误码构造业务异常（自动填充错误消息）
     * <p>
     * <b>注意：</b>务必在ErrorMessage.java中录入对应的错误消息
     * </p>
     * @param errorCode 错误码
     */
    public ServiceException(int errorCode) {
        super(errorCode);
        this.setErrorMessage(null);
    }
    public ServiceException(int errorCode, String message) {
        super(errorCode,message);
        this.setErrorMessage(message);
    }


    /**
     * 根据原因构造业务异常（自动填充错误消息）
     * <p>
     * <b>注意：</b>务必在ErrorMessage.java中录入对应的错误消息
     * </p>
     * @param errorCode 错误码
     * @param cause 异常的原因
     */
    public ServiceException(int errorCode, Throwable cause) {
        super(errorCode, cause);
        this.setErrorMessage(cause.getMessage());
    }

    /**
     * 根据原因构造业务异常（自动填充错误消息，并按照参数进行格式化）
     * <p>
     * <b>注意：</b>务必在ErrorMessage.java中录入对应的错误消息<br/>
     * <b>说明：</b>如果格式化消息的参数有多个，可以依次传入<br/>
     * <b>举例：</b>new Service(errorCode, cause, param1, param2 ...)
     * </p>
     * @param errorCode 错误码
     * @param cause 异常的原因
     * @param param 用于格式化错误消息的参数
     */
    public ServiceException(int errorCode, Throwable cause, Object... param) {
        super(errorCode, cause);
        this.setErrorMessage(cause.getMessage(), param);
    }

    public ServiceException(String errorMessage) {
        super(0);
        this.setErrorMessage(errorMessage);
    }
}
