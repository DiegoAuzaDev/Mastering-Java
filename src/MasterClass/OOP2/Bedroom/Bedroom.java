package MasterClass.OOP2.Bedroom;

public class Bedroom {

    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;


    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4,  Ceiling ceiling, Bed bed , Lamp lamp) {
        this.lamp = lamp;
        this.name = name;
        this.bed = bed;
        this.ceiling = ceiling;
        this.wall4 = wall4;
        this.wall3 = wall3;
        this.wall2 = wall2;
        this.wall1 = wall1;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void  makeBed (){
        System.out.print("Bedroom -> Making bed | Bed -> Making | Lamp -> Turning on");
        bed.make();
    }

}
