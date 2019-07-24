package com.tapdata.apidemo.common;

/**
 * 异常错误码<BR/>
 *
 */
public class ExceptionCode {
    /*
     * 公共异常错误码
     * 系统异常：10000-10099
     */
    public static final int MESSAGE = 11000;

    public static final int UNKNOWN_ERROR = 10000;
    public static final int DATABASE_ERROR = 10001;
    public static final int SESSION_TIMEOUT = 10002;
    public static final int PARSE_QUERY_EXP_ERROR = 10003;

    public static final int EMPTY_DATA = 10004;
    public static final int NULL_PARAMETER = 10005;
    public static final int ALREADY_EXIST = 10006;
    public static final int LOGIN_ERROR = 10007;
    public static final int SCOPE_ERROR = 10009;
    public static final int ACTION_PROHIBITED = 10010;
    public static final int LICENSE_INVALID = 10011;
    public static final int FILE_ERROR = 10012;
    public static final int BOUNDARY_EXCEPTION = 10013;
    public static final int TYPE_ERROR = 10014;
    public static final int NETWORK_ERROR = 10015;

    public static final int UNAUTHORIZED_EXCEPTION = 20401;
}
