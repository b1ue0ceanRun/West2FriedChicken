package X2FriedChickenRestaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public abstract class Drinks {
    protected String name;  //饮料名
    protected double cost;  //成本
    protected LocalDate PD;   //生产日期
    protected int EXP;      //保质期


    //构造方法


    //名称参数构造


    public Drinks(String name) {
        this.name = name;
    }

    //全参构造
    public Drinks(String name, double cost, LocalDate PD, int EXP) {
        this.name = name;
        this.cost = cost;
        this.PD = PD;
        this.EXP = EXP;
    }

    //=====================================================================
    //  判断是否过期的方法
    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        long daysDiff = ChronoUnit.DAYS.between(PD, today);
        return daysDiff > EXP;
    }

    // ====================================================================


    //抽象toString方法
    public abstract String toString();

    //======================================================================

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public LocalDate getPD() {
        return PD;
    }

    public int getEXP() {
        return EXP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setPD(LocalDate PD) {
        this.PD = PD;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

}
    //=======================================================================





