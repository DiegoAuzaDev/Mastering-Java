package MasterClass.PoolArea;

public class Rectangle {

    // region FIELDS
    private double width;
    private double length;

    // endregion

    // region CONSTRUCTOR

    public  Rectangle(double width , double length){
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    // endregion


    // region METHODS

    public double getWidth(){
        return  width;
    }

    public  double getLength(){
        return  length;
    }

    public  double getArea (){
        return  length * width;
    }


    // endregion



}
