package ru.mirea.task29;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private double dollar;
    private double euro;
    private double hryvnia;
    private double gbp;

    public CurrencyInfo(double dollar, double euro, double hryvnia, double gbp){
        this.dollar = dollar;
        this.euro = euro;
        this.hryvnia = hryvnia;
        this.gbp = gbp;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(double hryvnia) {
        this.hryvnia = hryvnia;
    }

    public double getGbp() {
        return gbp;
    }

    public void setGbp(double gbp) {
        this.gbp = gbp;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "dollar=" + dollar +
                ", euro=" + euro +
                ", hryvnia=" + hryvnia +
                ", gbp=" + gbp +
                '}';
    }
}
