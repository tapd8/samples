package com.tapdata.apidemo.common;

import java.text.MessageFormat;


public abstract class BaseException extends Exception {

    private static final long serialVersionUID = 1L;
    private int errorCode;
    private String errorMessage;

    protected BaseException(int errorCode) {
        this.setErrorCode(errorCode);
    }

    protected BaseException(int errorCode, Throwable cause) {
        super(cause);
        this.setErrorCode(errorCode);
    }

    protected BaseException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.setErrorCode(errorCode);
        this.setErrorMessage(errorMessage);
    }

    public int getErrorCode() {
        return errorCode;
    }

    protected void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    protected void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    protected void setErrorMessage(String errorMessage, Object[] param){
        if (param == null || param.length == 0){
            setErrorMessage(errorMessage);
        } else {
            MessageFormat format = new MessageFormat(errorMessage);
            String message = format.format(param);
            setErrorMessage(message);
        }
    }
}
