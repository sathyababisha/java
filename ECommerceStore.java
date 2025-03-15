public class ECommerceStore {

    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double total = 0.0;
        for (int price : prices) {
            total += price;
        }
        if (isPremiumMember) {
            total *= 0.95;
        }
        if (total > 5000) {
            total *= 0.90;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] cartPrices = {1200, 1500, 2000, 1000};
        boolean isPremium = true;

        double totalPrice = calculateTotalPrice(cartPrices, isPremium);
        System.out.printf("The total price of the items in the cart is: ₹%.2f%n", totalPrice);
    }
}
