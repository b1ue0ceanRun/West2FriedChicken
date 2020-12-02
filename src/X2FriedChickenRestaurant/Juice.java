package X2FriedChickenRestaurant;

import X2FriedChickenRestaurant.Drinks;

import java.time.LocalDate;


public class Juice extends Drinks {

    int EXP = 2;


    //==============================================================================================



    // 全参构造函数
    public Juice(String name, double cost, LocalDate PD, int EXP) {
        super(name, cost, PD, EXP);
    }

    public Juice(String name) {
        super(name);
    }


    //======================================================================================================
    //覆写toString方法
    @Override
    public String toString() {
        return "Juice{" +
                "保质期:" + this.EXP +
                ", 名字:'" + name + '\'' +
                ", 成本:" + cost +
                ", 生产日期:" + PD +
                '}';
    }

    @Override
    public int getEXP() {
        return EXP;
    }

    @Override
    public void setEXP(int EXP) {
        this.EXP = EXP;
    }
}
