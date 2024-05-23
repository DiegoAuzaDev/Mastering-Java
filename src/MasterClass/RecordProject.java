package MasterClass;

public class RecordProject {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 5; i ++){
            var s = new LPAStudent("S9S2300" + i, switch (i){
                case 1 -> "Diego";
                case 2 -> "Carol";
                case 3 -> "Edan";
                case 4 -> "Rogers";
                case 5 -> "Pedro";
                default -> "Anonymous" ;
            }, "10/04/2004", "Java Master Class " + i);
            System.out.println(s);
        }

        System.out.println();
        var pojoStudent = new Student("S990091", "Ann", "04/10/2004", "Java Master Class" );
        var recordStudent = new LPAStudent("RECORD12300", "record", "02/oct/2004", "Karla mi amor");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println();

        pojoStudent.setName("Pedro is new ");
//        recordStudent.name("Pedro is new ");

        System.out.println(pojoStudent.getName() + " " + "is talking");
        System.out.println(recordStudent.name() + " " + "is talking from record");

    }
}
