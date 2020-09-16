package co.nz.springBootDemo.api.exception;

import co.nz.springBootDemo.api.common.IErrorCode;

public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
