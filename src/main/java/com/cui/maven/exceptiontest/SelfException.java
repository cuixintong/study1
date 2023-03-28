package com.cui.maven.exceptiontest;

public class SelfException extends Exception{

    static final long serialVersionUID = -3387514229948L;

    public SelfException() {
        super();
    }

    public SelfException(String message) {
        super(message);
    }

    public SelfException(String message, Throwable cause) {
        super(message, cause);
    }

    public SelfException(Throwable cause) {
        super(cause);
    }

    protected SelfException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
