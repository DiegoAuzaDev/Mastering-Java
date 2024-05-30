package MasterClass.BillsBurguerChallenge;


public class Hamburger {

    // region FIELDS

    final Burger burger;
    final Toppings toppings;

    // endregion

    // region CONSTRUCTOR


    public Hamburger(){
        this.burger = new Burger();
        this.toppings = new Toppings();
    }

    public  Hamburger (Burger burger){
        this.burger = burger;
        this.toppings = new Toppings();
    }

    public Hamburger(Burger burger, Toppings toppings) {
        this.burger = burger;
        this.toppings = toppings;
    }

    // endregion

    // region METHODS

    public String getDetails (){
        return String.format("You order is a %s burger with a total of %s toppings -  deluxe burger %s" , burger.getType(), toppings.getNumberOfToppings(), toppings.getIsDeluxe() );
    }

    // endregion



}

class Burger {

    /*
        we can set 3 types of burger - Chicken - Beef - Beyond
    */

    // region FIELDS
    final String type;
    final double price;

    // endregion

    // region CONSTRUCTORS

    public Burger(){
        this.type = "Beef";
        this.price = 10.99;
    }

    public Burger (String type){

        switch (type){
            case "1" :
                this.type = "Chicken";
                this.price = 8.99;
                break;
            case "2" :
                this.type = "Beyond";
                this.price = 11.99;
                break;
            default:
                this.type = "Beef";
                this.price = 10.99;
        }

    }
    //  endregion

    // region METHODS

    public  String getType (){
        return type ;
    }
    public double getPrice (){
        return  price;
    }


    // endregion
}

class Toppings {

    // region FIELDS


    private String topping1 = "NO ADDED";
    private String topping2 = "NO ADDED";
    private String topping3 = "NO ADDED";
    private String topping4 = "NO ADDED" ;
    private String topping5 = "NO ADDED";
    private int numberOfToppings = 0 ;
    private final double  PRICE_PER_TOPPING = 0.25;
    private double finalPrice = 0;
    private boolean isDeluxe = false;

    // endregion

    // region CONSTRUCTOR
    public  Toppings (){

    }

    public  Toppings (boolean isDeluxe, String topping1){
        this.topping1 = topping1;
        this.numberOfToppings = 1;
       if(!isDeluxe){

           finalPrice = finalPrice +  PRICE_PER_TOPPING;
       }
       else {
           this.isDeluxe = true;
           finalPrice = 0.75;
       }
    }

    public  Toppings (boolean isDeluxe, String topping1, String topping2){
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.numberOfToppings = 2;
       if(!isDeluxe){
           finalPrice = finalPrice +  (PRICE_PER_TOPPING * 2);
       }
       else {
           this.isDeluxe = true;
           finalPrice = 0.75;
       }
    }
    public  Toppings (boolean isDeluxe, String topping1, String topping2, String topping3){
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.numberOfToppings = 3;

        if(!isDeluxe){
            finalPrice = finalPrice +  (PRICE_PER_TOPPING * 3);
        }
           else {
            this.isDeluxe = true;
            finalPrice = 0.75;
        }
    }

    public  Toppings (boolean isDeluxe, String topping1, String topping2, String topping3, String topping4){
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.numberOfToppings = 3;

        if(!isDeluxe){
            finalPrice = finalPrice +  (PRICE_PER_TOPPING * 3);
            this.numberOfToppings = 4;
        }
        else {
            this.isDeluxe = true;
            this.topping4 = topping4;
            finalPrice = 0.75;
        }
    }

    public  Toppings (boolean isDeluxe, String topping1, String topping2, String topping3, String topping4, String topping5){
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.numberOfToppings = 3;

        if(!isDeluxe){
            finalPrice = finalPrice +  (PRICE_PER_TOPPING * 3);
        }
        else {
            this.isDeluxe = true;
            this.numberOfToppings = 5;
            this.topping4 = topping4;
            this.topping5 = topping5;
            finalPrice = 0.75;
        }
    }



    // endregion

    // region METHODS

    public String getNumberOfToppings(){
        return String.valueOf(numberOfToppings);
    }

    public String getTopping () {
        return String.format("You added a total of %d toppings : %s , %s ,%s ,%s ,%s ", numberOfToppings, topping1, topping2, topping3, topping4, topping5 );
    }

    public double getFinalPrice(){
        return finalPrice;
    }

    public  String getIsDeluxe (){
        return String.valueOf(isDeluxe);
    }
    // endregion

}
