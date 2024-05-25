package MasterClass.Worker;

public class Main {
    public static void main(String[] args) {
        var diego = new Employee("Diego", "2004", "01/01/2020");
        var karla = new SalaryEmployee("Karla", "2004", "01/10/2004",  2000);

        System.out.println(karla);
        System.out.println(diego);
        System.out.println("karla's paycheck = $ " + karla.collectPay());

        karla.retire();
        System.out.println("Karla's pensions check " +  karla.collectPay());

        var marry = new HourlyEmployee("Marry", "1970",  "2021", 15);
        System.out.println(marry);

        System.out.println("marry's paycheck " + marry.collectPay());
        System.out.println("marry gets double pay  " + marry.getDoublePay());
    }
}
