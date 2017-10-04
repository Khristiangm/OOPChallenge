package com.timbuchalka;

/**
 * Created by KH389659 on 03/10/2017.
 */
public class Additionals {

    private boolean bacon;
    private boolean tomato;
    private boolean carrot;
    private boolean lettuce;
    private boolean pickles;
    private boolean olive;
    private double additionalPrice1;
    private double additionalPrice2;
    private double additionalPrice3;
    private double additionalPrice4;
    private double additionalPrice5;
    private double additionalPrice6;
    private int numberOfAdditionals;

    public Additionals(boolean bacon, boolean tomato, boolean carrot, boolean lettuce, boolean pickles, boolean olive, int numberOfAdditionals) {
        this.numberOfAdditionals = numberOfAdditionals;
        if (numberOfAdditionals > 0) {
            if (bacon) {
                numberOfAdditionals--;
                this.bacon = bacon;
                this.additionalPrice1 = 5.80;
            }
        }
        if (numberOfAdditionals > 0) {
            if (tomato) {
                numberOfAdditionals--;
                this.tomato = tomato;
                this.additionalPrice2 = 3.50;
            }
        }
        if (numberOfAdditionals > 0) {
            if (carrot) {
                numberOfAdditionals--;
                this.carrot = carrot;
                this.additionalPrice3 = 2.50;
            }
        }
        if (numberOfAdditionals > 0) {
            if (lettuce) {

                numberOfAdditionals--;
                this.lettuce = lettuce;
                this.additionalPrice4 = 1.50;
            }
        }
        if (numberOfAdditionals > 0) {
            if (pickles) {
                numberOfAdditionals--;
                this.pickles = pickles;
                this.additionalPrice5 = 2.48;
            }
        }
        if (numberOfAdditionals > 0) {
            if (olive) {
                numberOfAdditionals--;
                this.olive = olive;
                this.additionalPrice6 = 1.90;
            }
        }

    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isPickles() {
        return pickles;
    }

    public boolean isOlive() {
        return olive;
    }

    public double getAdditionalPrice1() {
        return additionalPrice1;
    }

    public double getAdditionalPrice2() {
        return additionalPrice2;
    }

    public double getAdditionalPrice3() {
        return additionalPrice3;
    }

    public double getAdditionalPrice4() {
        return additionalPrice4;
    }

    public double getAdditionalPrice5() {
        return additionalPrice5;
    }

    public double getAdditionalPrice6() {
        return additionalPrice6;
    }

    public int getNumberOfAdditionals() {
        return numberOfAdditionals;
    }


}
