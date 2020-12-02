package X2FriedChickenRestaurant;

import java.time.LocalDate;


public class Beer extends Drinks {
    float vol = 30;
    int EXP = 30;
    // ===========================================================================================
    //构造函数

    // 名称构造函数
    public Beer(String name) {
        super(name);
    }

    //全参构造
    public Beer(String name, double cost, LocalDate PD, int EXP) {
        super(name, cost, PD, EXP);
    }

    // ============================================================================================
    //覆写toString方法

    @Override
    public String toString() {
        return "Beer{" +
                "度数:" + vol +
                ", 保质期:" + this.EXP +
                ", 名字:'" + name + '\'' +
                ", 成本:" + cost +
                ", 生产日期:" + PD +'}';

                };


    //=========================================================================================
    public float getVol() {
        return vol;
    }

    public void setVol(float vol) {
        this.vol = vol;
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

//"度数："+this.vol+"保质期："+this.EXP;