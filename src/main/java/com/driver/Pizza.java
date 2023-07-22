package com.driver;

public class Pizza {

    private int totalprice;
    private Boolean isVeg;
    private String bill;
    private int baseprice;
    private int cheeseprice;
    private int toppingprice;
    private int paperbagprice;
    private boolean ischeeseadded;
    private boolean istoppingadded;
    private boolean ispaperbagadded;
    private boolean isbillgenerated;


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
        paperbagprice = 20;
        //Since by default value of boolean in java is false
//        ischeeseadded = false;
//        istoppingadded = false;
//        ispaperbagadded = false;
//        isbillgenerated = false;
        totalprice += baseprice;
        bill = "Base Price Of The Pizza: "+baseprice+"\n";
    }

    public int getPrice(){
        return this.baseprice;
    }

    public void addExtraCheese(){
        if(ischeeseadded == false){
            bill = bill + "Extra Cheese Added: "+cheeseprice+"\n";
            totalprice += cheeseprice;
            ischeeseadded = true;
        }
    }

    public void addExtraToppings(){
        if(istoppingadded == false){
            bill = bill + "Extra Toppings Added: "+ toppingprice+"\n";
            totalprice += toppingprice;
            istoppingadded = true;
        }
    }

    public void addTakeaway(){
        if (ispaperbagadded ==false) {
            bill = bill + "Paperbag Added: "+ paperbagprice +"\n";
            totalprice += paperbagprice;
            ispaperbagadded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isbillgenerated) {
            bill += "Total Price: " + totalprice + "\n";
            isbillgenerated = true;
        }
        return this.bill;
    }
}
