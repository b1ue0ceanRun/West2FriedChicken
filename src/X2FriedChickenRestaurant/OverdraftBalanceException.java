package X2FriedChickenRestaurant;

public class OverdraftBalanceException extends RuntimeException{

    String message;
    public OverdraftBalanceException(String error){
        message = error;
    }

    public String getMessage(){
        return message;
    }

}
