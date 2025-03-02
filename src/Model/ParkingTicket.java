package Model;

public class ParkingTicket {
    
    private int ticketNumber ;
    private long timestamp ;
    private double amount ;
    private Payment payment ;

    public ParkingTicket(int ticketNumber){
        this.ticketNumber = ticketNumber ;
        this.timestamp = System.currentTimeMillis();
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    
}
