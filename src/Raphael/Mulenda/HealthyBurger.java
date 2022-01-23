package Raphael.Mulenda;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat,  double price) {
        super("Healthy", meat,"Brown", price);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;

    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;

    }

    @Override
    public double itemizeHamburger() {
        double healthyBurgerPrice = super.itemizeHamburger();
        if (healthyExtra1Name != null){
            healthyBurgerPrice += this.healthyExtra1Price;
        }
        if (healthyExtra2Name != null){
            healthyBurgerPrice += this.healthyExtra2Price;
        }
        return healthyBurgerPrice;

    }
}
