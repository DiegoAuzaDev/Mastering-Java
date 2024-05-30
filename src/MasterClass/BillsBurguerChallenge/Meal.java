package MasterClass.BillsBurguerChallenge;

public class Meal {

    private Drink drink;
    private Hamburger hamburger;
    private Toppings toppings;

    public Meal(){
        this.hamburger = new Hamburger();
        this.drink =  new Drink();
        this.toppings = new Toppings();
    }

    public Meal(Hamburger hamburger, Drink drink) {
        this.hamburger = hamburger;
        this.drink = drink;
        this.toppings = new Toppings();
    }

    public Meal(Hamburger hamburger, Drink drink, Toppings toppings) {
        this.hamburger = hamburger;
        this.drink = drink;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Meal = " +
                "drink =" + drink.toString() +
                ", hamburger=" + hamburger.getDetails();
    }
}
