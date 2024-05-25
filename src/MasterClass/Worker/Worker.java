package MasterClass.Worker;


public class Worker {

    private String name;
    private String birthDate; // expected value goes from 0 until 100
    protected String endDate;

    public Worker(){

    }

    public Worker(String name, String birthDate){
    this.name = name;
    this.birthDate = birthDate;
    }

    public int getAge(){
        int age = 0;
        try {
            var currentDate = 2024 - Integer.getInteger(birthDate);
        }
        catch (NumberFormatException err){
            age = -1;
        }
        return age;
    }


    public double collectPay (){
        return 0.0;
    }


    public void terminate ( String endDate){
        this.endDate = endDate;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
