package Model;

public class CashPayment extends Payment{

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void initiateTransaction() {
        System.out.println("Processing Cash Payment of amount : " + amount);
        this.status = "Completed";
    }
    
}
