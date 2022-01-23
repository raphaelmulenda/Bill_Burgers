package Raphael.Mulenda;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Classic","Beef","black",5.25);
        hamburger.addHamburgerAddition1("Tomato",2);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Fanta",12);
        System.out.println("Total DeluxeBurger price is " + deluxeBurger.itemizeHamburger());
    }
}
