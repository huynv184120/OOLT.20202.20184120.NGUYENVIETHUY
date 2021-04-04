public class UnitTest {
    public static void main(String[] args) {
        DigitalVideoDisc disc1 = new DigitalVideoDisc("Harry Potter and the phoenix's oder",
                "adventure", "J.K.Rowling", 120, 5.4f);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Harry Potter and the phoenix's oder",
                "adventure", "J.K.Rowling", 121, 6.4f);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Harry Potter and the phoenix's oder",
                "adventure", "J.K.Rowling", 125, 2.4f);
        DigitalVideoDisc disc4 = new DigitalVideoDisc("Harry Potter and the phoenix's oder",
                "adventure", "J.K.Rowling", 123, 10.4f);

        Order order = new Order();
        order.addDigitalVideoDisc(disc1);
        order.addDigitalVideoDisc(disc4);
        order.addDigitalVideoDisc(disc2);
        order.addDigitalVideoDisc(disc3);

        order.getLuckyItem().getTitle();

        order.getList();

        System.out.println(order.totalCost());
    }
}