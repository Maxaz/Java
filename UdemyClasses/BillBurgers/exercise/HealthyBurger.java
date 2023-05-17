package BillBurgers.exercise;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat,  double price) {
        super("Healthy", meat, price,"Brown rye");
    }
    public void addHealthyAddition1(String additionName, double additionPrice){
        if (healthyExtra1Name == null){
            this.healthyExtra1Name = additionName;
            this.healthyExtra1Price = additionPrice;

        }
    }
    public void addHealthyAddition2(String additionName, double additionPrice){
        if (healthyExtra2Name == null){
            this.healthyExtra2Name = additionName;
            this.healthyExtra2Price = additionPrice;

        }
    }

    @Override
    public double itemizeHamburger() {
        double result =  super.itemizeHamburger();
        if(this.healthyExtra1Name != null) System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        if(this.healthyExtra2Name != null) System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        result += this.healthyExtra1Price + this.healthyExtra2Price;
        return Math.round(result*100.00)/100.00;
    }
}
