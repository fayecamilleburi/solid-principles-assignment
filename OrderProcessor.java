public class OrderProcessor implements Order {
    private final InvoiceService invoiceService;
    private final NotificationService notificationService;

    public OrderProcessor(InvoiceService invoiceService, NotificationService notificationService) {
        this.invoiceService = invoiceService;
        this.notificationService = notificationService;
    }

    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);

        String formattedEmail = customerName.replaceAll("\\s+", "").toLowerCase() + "@example.com";

        invoiceService.generateInvoice("invoice.pdf");
        notificationService.sendEmailNotification(formattedEmail);
    }
}
