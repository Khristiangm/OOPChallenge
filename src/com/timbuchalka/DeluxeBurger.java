package com.timbuchalka;

/**
 * Created by KH389659 on 03/10/2017.
 */
public class DeluxeBurger extends BaseHamburguer{

    private double chips;
    private double drinks;


    public DeluxeBurger() {
        super("Deluxe Combo","Deluxe Bread","Beef",new Additionals(false,false,false,false,false,false,0));
        this.chips = 5.00;
        this.drinks = 10.00;
    }

    public void comboValue(){
        System.out.println("The Combo Total Value was: " + (getBurguerPriceDefault() + chips + drinks ));

    }

}
