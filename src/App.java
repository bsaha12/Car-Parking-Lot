import Model.*;

public class App {
    public static void main(String[] args) throws Exception {

        ParkingLot parkingLot = new ParkingLot("Shop Parking", "Kolkata");

        Vehicle car = new Car("a,jbkbkdc");
        ParkingTicket ticket = parkingLot.getParkingTicket(car);
        car.assignTicket(ticket);

        Payment payment = new CashPayment(2332);
        payment.initiateTransaction();
        ticket.setPayment(payment);

        System.out.println("Parking Ticket Processed");

    }
}
