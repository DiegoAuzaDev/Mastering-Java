package MasterClass.Printer;

public class Printer {

    // region FIELDS

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // endregion

    // region CONSTRUCTORS

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }


    // endregion

    // region METHODS

    public int  addToner (int tonerAmount){
        int totalAmount = tonerLevel + tonerAmount;
       if(totalAmount > 100 || totalAmount < 0){
           return  -1;
       }
       tonerLevel += tonerAmount;
       return tonerLevel;
    }

    public int printPages (int pages){
        int jobPages= duplex ? (pages/ 2) + pages % 2 : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    // endregion


}
