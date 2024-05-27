package MasterClass;

public class Point {

    /*

    You have to represent a point in 2D space. Write a class with the name Point.
    The class needs two fields with name x and y of type int

    The class needs to have two constructor. The first constructor
    does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int. it
    needs to initialize the fields.


     */

    // region FIELDS

    private int x ;
    private int y;

    // endregion

    // region CONSTRUCTORS

    public Point(){

    }

    public  Point ( int x, int y){
        this.x = x;
        this.y = y;
    }

    // endregion

    // region METHODS

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    // endregion

}
