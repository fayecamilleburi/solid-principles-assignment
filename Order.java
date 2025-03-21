public interface Order {
    public void calculateTotal(double price, int quantity);
    public void placeOrder(String customerName, String address);
}