package MasterClass.Polymorphism;

public class Movie {

    private String title;

    public  Movie (String title){
        this.title = title;
    }

    public void watchMovie (){
        // this code is new, it basically gets the name of the subclass that is extending the movie class, such as adventure and so on
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie (String type, String title){

        return switch (type.toUpperCase().charAt(0)) {

            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}


class Adventure extends  Movie {

    public Adventure(String title) {
        super(title);
    }
    public void watchAdventure(){
        System.out.println("Watching Adventure");
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Pleasant Scene", "Scary Music", "Something Bad Happens");
    }
}

class Comedy extends  Movie {

    public Comedy(String title) {
        super(title);
    }

    public void watchComedy(){
        System.out.println("Watching Comedy");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Something funny happens", "Super funny", "Something funnier Happens");
    }
}

class ScienceFiction extends  Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    public void watchScienceFiction(){
        System.out.println("Watching Science Fiction");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Aliens do bad stuff", "Space guys", "New planet");
    }
}
