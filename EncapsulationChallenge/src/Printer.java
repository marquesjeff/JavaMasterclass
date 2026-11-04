public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(this.tonerLevel + tonerLevel > 100){
            this.tonerLevel = 100;
        }else if(this.tonerLevel + tonerLevel < 0){
            this.tonerLevel = 0;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public Printer(int tonerLevel, boolean duplex){
        this(tonerLevel, 0, duplex);
    }

    public Printer(){
        this(0, 0, false);
    }

    public int addToner(int tonerAmount){
        if(this.tonerLevel + tonerAmount > 100 ||
                this.tonerLevel + tonerAmount < 0){
            return -1;
        }else{
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }

    }
    public int printPages(int pages){
        if(duplex){
            this.pagesPrinted += ((pages / 2) + (pages % 2));
            System.out.println("Duplex printer activated.");

        }else{
            this.pagesPrinted += pages;
        }
        return this.pagesPrinted;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplex=" + duplex +
                '}';
    }
}
