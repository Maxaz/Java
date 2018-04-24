public class Printer {
    private int tonerLevel;
    private int tonerCapacity;
    private int tonerPercentage = (int) Math.ceil(tonerLevel / tonerCapacity);
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int tonerCapacity, int pagesPrinted, boolean isDuplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <= tonerCapacity) {
            this.tonerLevel = tonerLevel;
        }
        if (pagesPrinted >= 0) {
            this.pagesPrinted = pagesPrinted;
        }
        this.isDuplexPrinter = isDuplexPrinter;
        this.tonerCapacity = tonerCapacity;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void fillUpToner(int refill) {
        if (refill > 0) {
            if ((refill + this.tonerLevel) >= this.tonerCapacity) {
                this.tonerLevel = this.tonerCapacity;
                System.out.println("Toner is now 100% filled.");
                System.out.println("You have spared: " + refill + "of toner.");
            } else {
                System.out.println("The toner is now: " + this.tonerPercentage + "% filled.");
            }
        }

    }

    public void checkTonerLevel() {
        System.out.println("Toner level is at: " + this.tonerPercentage + "%.");
    }

    public void printPage(int pages, boolean isDuplex) {
//        if (!isDuplex) {
//            this.pagesPrinted += pages;
//        } else if (this.isDuplexPrinter) {
//            this.pagesPrinted = (int) Math.ceil(pages / 2);
//        }
        if (pages > 0) {
            if (this.isDuplexPrinter && isDuplex) {
                this.pagesPrinted += (int) Math.ceil(pages / 2);
            } else {
                this.pagesPrinted += pages;
            }
        } else {
            System.out.println("Wrong number of pages to print. Try again.");
        }
    }


}
