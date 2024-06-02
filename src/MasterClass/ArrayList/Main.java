package MasterClass.ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem( String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name, type );
    }
}
public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "PRODUCT", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCT", 5);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();

        objectList.add(new GroceryItem(("Butter")));
        objectList.add("pirate");

        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem(("Butter")));
        groceryItems.add(new GroceryItem(("Apple")));
        groceryItems.add(new GroceryItem(("Orange")));

        groceryItems.add( 0 , new GroceryItem("apples", "PRODUCTS", 6));

        groceryItems.remove(1);


        System.out.println(groceryItems);

    }
}
