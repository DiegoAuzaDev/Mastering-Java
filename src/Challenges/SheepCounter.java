package Challenges;

public class SheepCounter {

    // Consider and array/list of sheep where some may be missing from their place. We need a function that counts the
    // number of sheep present in the array. (tre means present)
    // Don't forget to check for back values lke null/undefined

    public static void main(String[] args) {
        Boolean[] sheepTest = { true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true, null };

        SheepCounter sheep = new SheepCounter();
        System.out.println(sheep.countSheep(sheepTest));

    }


    public  int countSheep(Boolean[] arrayOfSheep) {

        int totalSheep = 0;

        for(Boolean sheep : arrayOfSheep ){
           if( sheep != null && sheep){
               totalSheep ++;
           }
        }

        return totalSheep;
    }

}
