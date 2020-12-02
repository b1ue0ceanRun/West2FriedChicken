package X2FriedChickenRestaurant;




import java.util.ArrayList;


public class West2FriedChickenRestaurant implements FriedChickenRestaurant {


    //===============================================================================
    //静态初始化
    static {


        ArrayList<SetMeal> setMealList = new ArrayList<>();
        SetMeal setMeal1 = new SetMeal("套餐1:黄金脆皮鸡加可乐", "黄金脆皮鸡", 25, new Juice("可乐"));
        setMealList.add(setMeal1);
        SetMeal setMeal2 = new SetMeal("套餐2:黄金脆皮鸡加雪花", "黄金脆皮鸡", 25, new Beer("雪花"));
        setMealList.add(setMeal2);

    }


   
    //======================================================================================================

    double balance;

    ArrayList<Beer> BeerList = new ArrayList<>();
    ArrayList<Juice> JuiceList = new ArrayList<>();

    //=======================================================================================================
    //构造方法
    public West2FriedChickenRestaurant(double balance, ArrayList<Beer> beerList, ArrayList<Juice> juiceList) {
        this.balance = balance;
        BeerList = beerList;
        JuiceList = juiceList;
    }

    public West2FriedChickenRestaurant() {
    }

    //==========================================================================
    //重写的use方法

    private void use(Beer beer) throws IngredientSortOutException {
        for (int i = 0; i < BeerList.size(); i++) {
            if (BeerList.get(i).isExpired())
                BeerList.remove(BeerList.get(i));
        }


        for (int i = 0; i < BeerList.size(); i++) {
            if (beer.name.equals(BeerList.get(i).name)){
            BeerList.remove(i);
                return;
            }

        }
        throw new IngredientSortOutException(beer.name + "已售空");

    }

    private void use(Juice juice) throws IngredientSortOutException {
        for (int i = 0; i < JuiceList.size(); i++) {
            if (JuiceList.get(i).isExpired())
                JuiceList.remove(JuiceList.get(i));
        }

        for (int i = 0; i < JuiceList.size(); i++) {

            if (juice.name.equals(JuiceList.get(i).name)) {
                JuiceList.remove(i);
                return;
            }

        }
        throw new IngredientSortOutException(juice.name + "不足");


    }
    // =============================================================================
    //出售套餐方法

    @Override
    public void SellSetMeal(SetMeal setMeal, int num) {
        for (int i = 0; i < num; i++) {
            if (setMeal.getDrinks() instanceof Beer) {
                use((Beer) setMeal.getDrinks());

            }

            if (setMeal.getDrinks() instanceof Juice) {
                use((Juice) setMeal.getDrinks());
            }
        }

        balance += setMeal.getSetMealPrice() * num;

    }


    //===================================================================================
    //批量进货
    @Override
    public void Purchase(Drinks drinks, int num) throws OverdraftBalanceException {
         ;
        if ( num * drinks.cost > balance)

            throw new OverdraftBalanceException("进货差"+(num * drinks.cost - balance)+"元");
        else
            balance -= num * drinks.cost;


        if (drinks instanceof Beer) {
            for (int i = 0; i < num; i++) {
                BeerList.add((Beer) drinks);
            }
        }

        if (drinks instanceof Juice)
            for (int i = 0; i < num; i++) {
                JuiceList.add((Juice) drinks);
            }

    }

}

