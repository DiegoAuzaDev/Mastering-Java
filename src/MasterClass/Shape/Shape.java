package MasterClass.Shape;

class Shape {
    private  int x;
    private int y;

    public Shape(int x, int y){
        this.x = x; // this will access any field in the class this() will access any constructor on that class
        this.y = y;
    }

}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y){
        this(x, y, 0, 0);
    }


    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }


}
