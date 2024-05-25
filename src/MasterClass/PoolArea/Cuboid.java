package MasterClass.PoolArea;

public class Cuboid  extends  Rectangle{

    // region FIELDS

    private  double height;

    // endregion

    // region CONSTRUCTOR

    public Cuboid (double width, double length, double height){
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    // endregion


    // region METHODS

    public double getHeight(){
        return  height;
    }

    public double getVolume (){
        return getArea() * height;
    }

    // endregion

}
