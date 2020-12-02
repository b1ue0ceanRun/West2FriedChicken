package X2FriedChickenRestaurant;

public class IngredientSortOutException extends java.lang.RuntimeException {
          String message;
          public IngredientSortOutException(String error){
              message = error;
          }

          public String getMessage(){
              return message;
          }


}
