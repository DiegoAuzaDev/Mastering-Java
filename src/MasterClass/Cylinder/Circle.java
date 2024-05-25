package MasterClass.Cylinder;

public class Circle {

    // region FIELDS

    private double radius;

    // endregion

    // region CONSTRUCTORS

    public Circle (double radius){
        this.radius = radius < 0 ? 0 : radius;
    }

    // endregion

    // region METHODS

    public double getRadius(){
        return radius;
    }

    public double getArea (){
        return  radius * radius * Math.PI;
    }


    // endregion
}
