package MasterClass.TheObjectClass;

public class TheObjectClass extends  Object {

    public static void main(String[] args) {

    var max = new Student("Max", 21);
        System.out.println(max);

    var student = new PrimarySchoolStudent("Jimmy", 8, "Karla");
    System.out.println(student);


    }

}

class Student {
    private  String name;
    private int age;

    Student (String name, int age){
            this.age = age;
            this.name = name;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
     return parentName + "'s kid " + super.toString();
    }
}