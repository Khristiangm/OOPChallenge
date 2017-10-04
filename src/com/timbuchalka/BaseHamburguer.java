package com.timbuchalka;

/**
 * Created by KH389659 on 03/10/2017.
 */
public class BaseHamburguer {
    private String name;
    private String breadRollType;
    private double burguerPriceMoreAdditionals;
    private double burguerPriceDefault;
    private String meat;
    private Additionals additionals;


    public BaseHamburguer(String name, String breadRollType, String meat, Additionals additionals) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.burguerPriceMoreAdditionals = 10.00;
        this.burguerPriceDefault = 10.00;
        this.meat = meat;
        this.additionals = additionals;


    }

    public void printAdditional(String ingredient, boolean isAdditional, double additionalPrice) {

        if (isAdditional) {
            this.burguerPriceMoreAdditionals += additionalPrice;
            System.out.println("Your Burger is a " + this.name +
                    " You added " + ingredient +
                    " And the total Value is: " + this.burguerPriceMoreAdditionals +
                    "R$" + " Due to the addition of " + ingredient + " which costs " + additionalPrice);

        }


    }

    public void burguerTotalValue() {

        printAdditional("Bacon", additionals.isBacon(), additionals.getAdditionalPrice1());
        printAdditional("Tomato", additionals.isTomato(), additionals.getAdditionalPrice2());
        printAdditional("Carrot", additionals.isCarrot(), additionals.getAdditionalPrice3());
        printAdditional("Lettuce", additionals.isLettuce(), additionals.getAdditionalPrice4());
        printAdditional("Pickles", additionals.isPickles(), additionals.getAdditionalPrice5());
        printAdditional("Olive", additionals.isOlive(), additionals.getAdditionalPrice6());

        if (additionals.getNumberOfAdditionals() == 0) {

            System.out.println(this.name + " Nao Possui adicionais, apenas Coca-cola e Batata Frita");
        }


//        if (additionals.isBacon()) {
//            burguerPriceMoreAdditionals += additionals.getAdditionalPrice1();
//            printAdditional(this.name, "Bacon", burguerPriceMoreAdditionals, additionals.getAdditionalPrice1());
//        }
//        if (additionals.isTomato()) {
//            burguerPriceMoreAdditionals += additionals.getAdditionalPrice2();
//            printAdditional(this.name, "Tomato", burguerPriceMoreAdditionals, additionals.getAdditionalPrice2());
//        }
//        if (additionals.isCarrot()) {
//            burguerPriceMoreAdditionals += additionals.getAdditionalPrice3();
//            printAdditional(this.name, "Carrot", burguerPriceMoreAdditionals, additionals.getAdditionalPrice3());
//        }
//        if (additionals.isLettuce()) {
//            burguerPriceMoreAdditionals += additionals.getAdditionalPrice4();
//            printAdditional(this.name, "Lettuce", burguerPriceMoreAdditionals, additionals.getAdditionalPrice4());
//        }
//        if (additionals.isPickles()) {
//            burguerPriceMoreAdditionals += additionals.getAdditionalPrice5();
//            printAdditional(this.name, "Pickles", burguerPriceMoreAdditionals, additionals.getAdditionalPrice5());
//        }
//        if (additionals.isOlive()) {
//            burguerPriceMoreAdditionals += additionals.getAdditionalPrice6();
//            printAdditional(this.name, "Olive", burguerPriceMoreAdditionals, additionals.getAdditionalPrice6());
//        }


    }


    public String getBreadRollType() {
        return breadRollType;
    }

    public double getBurguerPriceMoreAdditionals() {
        return burguerPriceMoreAdditionals;
    }

    public String getMeat() {
        return meat;
    }

    public Additionals getAdditionals() {
        return additionals;
    }

    public double getBurguerPriceDefault() {
        return burguerPriceDefault;
    }


}
