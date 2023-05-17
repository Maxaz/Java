package BillBurgers.exercise;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;

    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        if (this.addition1Name == null) {
            this.addition1Name = additionName;
            this.addition1Price = additionPrice;

        }
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        if (this.addition2Name == null) {
            this.addition2Name = additionName;
            this.addition2Price = additionPrice;

        }
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        if (this.addition3Name == null) {
            this.addition3Name = additionName;
            this.addition3Price = additionPrice;

        }
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        if (this.addition4Name == null) {
            this.addition4Name = additionName;
            this.addition4Price = additionPrice;

        }
    }

    public double itemizeHamburger() {
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
        if (this.addition1Name != null) System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        if (this.addition2Name != null) System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        if(this.addition3Name != null) System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        if(this.addition4Name != null) System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        double result = price + addition1Price + addition2Price + addition3Price + addition4Price;
        return Math.round(result * 100.00) / 100.00;
    }
}
