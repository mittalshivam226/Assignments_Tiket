class Bank {
    protected double defaultCharge = 2.0;

    protected double addDefaultCharge() {
        return defaultCharge;
    }
}

class ICICI extends Bank {
    private final double ICICI_charge = 0.5;
    public double TransactionCharge() {
        return addDefaultCharge() + ICICI_charge;
    }
}

class HDFC extends Bank {
    private final double HDFC_charge = 0.75;
    public double TransactionCharge() {
        return addDefaultCharge() + HDFC_charge;
    }
}

public class BankCharges {
    public static void main(String[] args) {

        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();

        System.out.println("Transaction Charge for ICICI Bank = "
                + icici.TransactionCharge());

        System.out.println("Transaction Charge for ICICI Bank = "
                + hdfc.TransactionCharge());
    }
}
