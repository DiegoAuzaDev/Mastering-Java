package MasterClass;

// region MAIN CAR

//public class Main {
//
//    public static void main(String[] args) {
//        Car car = new Car();
//        car.describeCar();
//        System.out.println(car.getMake());
//    }
//
//}

// endregion


import Challenges.Customer;

public class Main {
    public static void main(String[] args) {

        var customer = new Customer();
        System.out.println(customer.getName());
        System.out.println(customer.getEmailAddress());
        System.out.println(customer.getCreditLimit());

        System.out.println(" --------------------- ");

        var customerDiego = new Customer("Diego Luis", "diego@email.com", 1_000);
        System.out.println(customerDiego.getName());
        System.out.println(customerDiego.getEmailAddress());
        System.out.println(customerDiego.getCreditLimit());


        System.out.println(" --------------------- ");

        var customerNoa = new Customer("Noa", "noa@email.com");
        System.out.println(customerNoa.getName());
        System.out.println(customerNoa.getEmailAddress());
        System.out.println(customerNoa.getCreditLimit());
    }
}