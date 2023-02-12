class UnsupportedFunctionException extends RuntimeException{
    private final int ERR_CODE;

    UnsupportedFunctionException(String msg, int errCode){
        super(msg);
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String msg){
        this(msg, 100);
    }

    public int getErrCode(){
        return ERR_CODE;
    }

    public String getMessage(){
        return "["+getErrCode()+"]" + super.getMessage();
    }
}


public class ExceptionTest2 {
    public static void main(String[] args) throws Exception
    {
        throw new UnsupportedFunctionException("it's not supported function.", 100);
    }
}
