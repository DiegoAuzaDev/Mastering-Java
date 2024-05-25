package MasterClass;

public class WallArea {

    // region FIELDS

    private  double width;
    private double height;

    // endregion

    // region CONSTRUCTOR

    public WallArea (){}

    public WallArea (double width, double height){
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }



    // endregion

    // region METHODS

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea (){
        return  height * width;
    }

// endregion

}
