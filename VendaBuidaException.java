public class VendaBuidaException extends Exception{
    protected String message;

    public VendaBuidaException(String message) {

        super(message);

    }
    public String getMessage(){

        return message;
    }
}
