package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        HealthyBurguer healthyBurguer = new HealthyBurguer("Beef",
                new Additionals(false, true, true, true, true, true, 6));

        healthyBurguer.burguerTotalValue();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        DeluxeBurger deluxeBurger = new DeluxeBurger();

        deluxeBurger.burguerTotalValue();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        deluxeBurger.comboValue();






    }
}
