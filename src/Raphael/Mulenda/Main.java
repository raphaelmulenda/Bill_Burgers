package Raphael.Mulenda;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Classic","Beef","black",5.25);
        hamburger.addHamburgerAddition1("Tomato",2);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
    }
}
