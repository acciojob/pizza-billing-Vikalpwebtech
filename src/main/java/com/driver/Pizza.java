package com.driver;

public class Pizza {

    private int price;
    private String bill;
    private int baseprice;
    private int cheeseprice;
    private int toppingprice;
    private int paperbagprice;
    private boolean ischeeseadded;
    private boolean istoppingadded;
    private boolean istakeawayadded;
    private boolean isbillgenerated;


    public Pizza(Boolean isVeg){
        //pizza is veg
        if(isVeg){
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
        price = baseprice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!ischeeseadded){
            this.price += cheeseprice;
            ischeeseadded = true;
        }
    }

    public void addExtraToppings(){
        if(!istoppingadded){
            this.price += toppingprice;
            istoppingadded = true;
        }
    }

    public void addTakeaway(){
        if (!istakeawayadded) {
            this.price += paperbagprice;
            istakeawayadded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isbillgenerated) {
            this.bill = "Base Price Of The Pizza: "+baseprice+"\n";
            if(ischeeseadded){
                this.bill = this.bill + "Extra Cheese Added: "+cheeseprice+"\n";
            }
            if(istoppingadded){
                this.bill = this.bill + "Extra Toppings Added: "+ toppingprice+"\n";
            }
            if (istakeawayadded) {
                this.bill = this.bill + "Paperbag Added: "+ paperbagprice +"\n";
            }

            this.bill += "Total Price: " + price + "\n";
            isbillgenerated = true;
        }
        return this.bill;
    }
}
