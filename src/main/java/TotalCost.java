public class TotalCost {
    public static void main(String[] args) {
        int laptopPrice = 85000;
        int mousePrice = 2500;
        int totalCost = laptopPrice + mousePrice;

        double discount = 0.15;
        double discountedPrice = totalCost - (totalCost * discount);

        System.out.println("Total cost after 15% discount: " + discountedPrice + " tk");
    }
}
