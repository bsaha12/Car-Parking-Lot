package Model;

public abstract class Payment {
    protected double amount ;
    protected String status ;

    public Payment(double amount){
        this.amount = amount ;
        this.status = "Pending" ;
    }

    public abstract void initiateTransaction();
}
