package co.nz.springBootDemo.api.common;

public enum ResultCode implements IErrorCode {
    SUCCESS(200, "success"),
    FAILED(500, "Internal server error"),
    VALIDATE_FAILED(404, "Parameters failed verification"),
    UNAUTHORIZED(401, "Not able to logon or token expired"),
    FORBIDDEN(403, "No access to related resources");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}