package MasterClass.Cylinder;

public class Cylinder extends  Circle{

    // region FIELDS

    private double height;

    // endregion


    // region CONSTRUCTORS

    public Cylinder(){
        this(0, 0);
    }

    public Cylinder (double height){
        this( height < 0 ? 0 : height, 0);
    }


    public Cylinder(double radius, double height){
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    // endregion

    // region METHODS

    public double getHeight (){
        return  height;
    }

    // endregion

    public double getVolume (){
        return  getArea() * height;
    }


}
