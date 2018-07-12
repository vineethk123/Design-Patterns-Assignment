public class OrderSub {
    public static void main(String args[]) {
        double total_price;
        // Make the Bread
        Bread sub_bread = new Bread.BreadBuilder("medium").setBake("mild").build();
        // Add Sauces
        Sauce sub_sauce = new Sauce.SauceBuilder().addChilli().addMayonnaise().build();
        // Addons
        Addons sub_addons = new Addons.AddonsBuilder().addCheese().addVeggies().build();
        // Salad
        Salad sub_salad = new Salad.SaladBuilder().addTomatoes().addCapsicum().addCarrot().build();

        // Calculate Total Price
        total_price = sub_bread.getPrice() + sub_sauce.getPrice() + sub_addons.getPrice() + sub_salad.getPrice();

        // Order Summary
        System.out.println("Your Sub:");
        System.out.println(sub_bread);
        System.out.println(sub_sauce);
        System.out.println(sub_addons);
        System.out.println(sub_salad);
        System.out.println("\nTotal Price: " + total_price);
    }
}
