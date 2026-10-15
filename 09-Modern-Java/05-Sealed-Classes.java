sealed interface Payment permits CardPayment, UpiPayment {}

final class CardPayment implements Payment {}
final class UpiPayment implements Payment {}

class SealedClassesExample {
    public static void main(String[] args) {
        Payment payment = new CardPayment();

        if (payment instanceof CardPayment) {
            System.out.println("Payment made using Card");
        } else if (payment instanceof UpiPayment) {
            System.out.println("Payment made using UPI");
        }
    }
}
