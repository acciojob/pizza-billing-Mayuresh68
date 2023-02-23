package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int topping;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isTakeaway;
    boolean isBillCreated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";
        // your code goes here
        if(isVeg){ //veg pizza
            this.price = 300;
            this.topping = 70;
        }
        else{ // non veg pizza
            this.price  = 400;
            this.topping = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price += cheese;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
       if(!isExtraToppingAdded){
           this.price+= topping;
           this.isExtraToppingAdded=true;
       }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            this.price += 20;
            isTakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated){
            if(isExtraCheeseAdded){
                this.bill += "Extra Cheese Added: "+ this.cheese+"\n";
            }
            if(isExtraToppingAdded){
                this.bill += "Extra Toppings Added: "+ this.topping+"\n";
            }
            if(isTakeaway){
                bill+= "Paperbag Added: "+ "20"+"\n";
            }
            this.bill +=  "Total Price: "+this.price+"\n";
            isBillCreated = true;
        }
        return this.bill;
    }
}
