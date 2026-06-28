class Mobile {

    double price;

    Mobile(double price) {
        this.price = price;
    }
}

public class MobileUpdate {

    static void applyDiscount(Mobile m) {
        m.price = m.price - (m.price * 20 / 100);
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile(30000);

        System.out.println("Price Before Discount : " + m1.price);

        applyDiscount(m1);

        System.out.println("Price After Discount  : " + m1.price);
    }
}
