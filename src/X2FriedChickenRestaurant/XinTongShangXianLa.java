package X2FriedChickenRestaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class XinTongShangXianLa {


    public static void main(String[] args) {

        Drinks Snow1 = new Beer("雪花",5,LocalDate.of(2013,2,12),60);



        Drinks Snow = new Beer("雪花",5,LocalDate.now(),60);
        Drinks Cola = new Juice("可乐",2,LocalDate.now(),60);

        ArrayList<Beer> BeerList = new ArrayList<>();
        ArrayList<Juice> JuiceList = new ArrayList<>();

        ArrayList<SetMeal> setMealList = new ArrayList<>();
        SetMeal setMeal1 = new SetMeal("套餐1:黄金脆皮鸡加可乐", "黄金脆皮鸡", 25, new Juice("可乐"));
        setMealList.add(setMeal1);
        SetMeal setMeal2 = new SetMeal("套餐2:黄金脆皮鸡加雪花", "黄金脆皮鸡", 25, new Beer("雪花"));
        setMealList.add(setMeal2);



        West2FriedChickenRestaurant west2FriedChickenRestaurant = new West2FriedChickenRestaurant(1000,BeerList,JuiceList);


        //测试过期
        //west2FriedChickenRestaurant.Purchase(Snow1,10);
        //west2FriedChickenRestaurant.SellSetMeal(setMeal2,10);  //雪花不足











        //测试进货异常
        // west2FriedChickenRestaurant.Purchase(Snow,1000);

        west2FriedChickenRestaurant.Purchase(Snow,100);
        west2FriedChickenRestaurant.Purchase(Cola,100);

        //测试售货异常
        //west2FriedChickenRestaurant.SellSetMeal(setMeal1,101);










    }
}
