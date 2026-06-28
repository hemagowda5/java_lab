class Bank {

    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {

    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {

    @Override
    double getInterestRate() {
        return 7.2;
    }
}

class ICICI extends Bank {

    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class BankInterest {

    public static void main(String[] args) {

        SBI s = new SBI();
        HDFC h = new HDFC();
        ICICI i = new ICICI();

        System.out.println("SBI Interest Rate: " + s.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + h.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + i.getInterestRate() + "%");
    }
}
