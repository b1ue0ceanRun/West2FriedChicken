package X2FriedChickenRestaurant;



public class SetMeal {
    String SetMeal;            //套餐名
    String FriedChickenName;   //炸鸡名
    double SetMealPrice;       //套餐价格
    Drinks drinks;             //饮料成员变量


    //=================================================================
    public SetMeal(String setMeal, String friedChickenName, double setMealPrice, Drinks drinks) {
        SetMeal = setMeal;
        FriedChickenName = friedChickenName;
        SetMealPrice = setMealPrice;
        this.drinks = drinks;
    }


    //========================================================================
    @Override
    public String toString() {
        return "SetMeal{" +
                "SetMeal='" + SetMeal + '\'' +
                ", FriedChickenName='" + FriedChickenName + '\'' +
                ", SetMealPrice=" + SetMealPrice +
                ", drinks=" + drinks +
                '}';
    }


    //========================================================================


    public String getSetMeal() {
        return SetMeal;
    }

    public void setSetMeal(String setMeal) {
        SetMeal = setMeal;
    }

    public String getFriedChickenName() {
        return FriedChickenName;
    }

    public void setFriedChickenName(String friedChickenName) {
        FriedChickenName = friedChickenName;
    }

    public double getSetMealPrice() {
        return SetMealPrice;
    }

    public void setSetMealPrice(double setMealPrice) {
        SetMealPrice = setMealPrice;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }
}
