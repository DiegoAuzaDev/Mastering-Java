package MasterClass.Inheritance;

public class FirstInheritance {

    public static void main(String[] args) {

    var animal = new Animal("Generic Animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    var dog = new Dog();
    doAnimalStuff(dog, "fast");

    var yorkie = new Dog("Yorkie", 15);
    doAnimalStuff(yorkie, "fast");

    var retriever = new Dog("Labrador Retriever", 6,"Floppy", "Swimmer" );

    doAnimalStuff(retriever, "slow");


    var wolf = new Dog("wolf", 40);
    doAnimalStuff(wolf, "slow");

    var myFirstFish = new Fish("GoldFish", 0.24, 2 ,3);
    doAnimalStuff(myFirstFish, "fast");

    }

    public static  void doAnimalStuff (Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("___________");

    }

}
