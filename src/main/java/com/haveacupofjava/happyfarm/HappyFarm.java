package com.haveacupofjava.happyfarm;

public class HappyFarm {

    private static HappyFarm instance;

    private Double funds;

    private HappyFarm() {
        funds = 1000.0;
    }

    /**
     * Returns a single instance of HappyFarm
     * @return A single instance of HappyFarm
     */
    public static HappyFarm getInstance() {
        HappyFarm inst = instance;
        if (inst == null) {
            synchronized (HappyFarm.class) {
                inst = instance;
                if (inst == null) {
                    inst = new HappyFarm();
                    instance = inst;
                }
            }
        }

        return inst;
    }

    protected double moneyIn(double amount) {
        this.funds += amount;
        return this.funds;
    }

    protected double moneyOut(double amount) {
        this.funds -= amount;
        return this.funds;
    }

    public double getFunds() {
        return this.funds;
    }

}