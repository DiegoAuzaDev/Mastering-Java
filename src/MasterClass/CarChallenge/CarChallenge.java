package MasterClass.CarChallenge;

public class CarChallenge {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public CarChallenge(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine (){
        String className = getClass().getSimpleName();
        return className + " -> startEngine()";
    }

    public String accelerate () {
        String className = getClass().getSimpleName();
        return className + " -> accelerate()";
    }

    public  String brake(){
        String className = getClass().getSimpleName();
        return className + " -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mitsubishi extends  CarChallenge {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}


class Holden extends  CarChallenge {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
