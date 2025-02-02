public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsAdded = 100;
    private int backPackPrice = 20;

    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        System.out.println("Extra cheese is added");
        this.price += extraCheesePrice;

    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        System.out.println("Extra toppings are added");
        this.price += extraToppingsAdded;

    }

    public void takeAway() {
        isOptedForTakeAway = true;
        System.out.println("Take away");
        this.price += backPackPrice;

    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese added: " +extraCheesePrice+ "\n";

        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings added: " +extraToppingsAdded+ "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take Away: " +basePizzaPrice+ "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}