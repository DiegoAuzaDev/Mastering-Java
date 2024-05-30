package MasterClass.BillsBurguerChallenge;

public class Drink {

    private double PRICE_SMALL = 2.5;
    private double PRICE_MEDIUM = PRICE_SMALL * 2;
    private double PRICE_LARGE = PRICE_SMALL * 3;
    private String type = "Pepsi";
    private String size;
    private double value;

    public Drink(){
        this.size = "Medium";
        this.value = PRICE_MEDIUM;
    }

    public Drink(String size){
        switch (size){
            case "S" :
                value = PRICE_SMALL;
                size = "Small";
                break;
            case "L" :
                value = PRICE_LARGE;
                size = "Large";
                break;
            default:
                value = PRICE_MEDIUM;
                size = "Medium";
        }
    }

    public double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", value=" + value ;
    }
}
