package com.driver;

public class Pizza {

    private int totalprice;
    private Boolean isVeg;
    private String bill;
    private int baseprice;
    private int cheeseprice;
    private int toppingprice;
    private boolean ischeeseadded;
    private boolean istoppingadded;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        //pizza is veg
        if(isVeg == true){
            baseprice = 300;
            toppingprice =70;
        }
        else{
            baseprice = 400;
            toppingprice = 120;
        }
        cheeseprice = 80;
        ischeeseadded = false;
        istoppingadded = false;
        totalprice += baseprice;
    }

    public int getPrice(){
        return this.baseprice;
    }

    public void addExtraCheese(){
        if(ischeeseadded == false){
            bill = "Extra Cheese Added: "+cheeseprice+"\n";
        }
        ischeeseadded = true;
    }

    public void addExtraToppings(){
        if(istoppingadded == false){
            bill = "Extra Toppings Added: "+ toppingprice+"\n";
        }
        istoppingadded = true;
    }

    public void addTakeaway(){
        bill = "Paperbag Added: 20\n";
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
