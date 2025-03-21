public class OrderTest {
    public static void main(String[] args) {
        InvoiceService invoiceService = new PDFInvoiceService();
        NotificationService notificationService = new EmailNotificationService();

        Order order = new OrderProcessor(invoiceService, notificationService);
        order.calculateTotal(10.0,2);
        order.placeOrder("Juan Dela Cruz", "123 Central St.");
    }
}
