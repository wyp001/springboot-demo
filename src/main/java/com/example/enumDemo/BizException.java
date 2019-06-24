package com.example.enumDemo;

public class BizException extends RuntimeException{
    private final int errCode;

    public BizException(int errCode, String errMsg){
        super(errMsg);
        this.errCode = errCode;
    }

    public BizException(ErrorCodes error){
        super(error.getMsg());
        this.errCode = error.getCode();
    }

    public int getErrCode() {
        return errCode;
    }
}
