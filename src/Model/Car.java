package Model;

public class Car extends Vehicle{

    public Car(String licenseNumber){
        super(licenseNumber);
    }

    @Override
    public void assignTicket(ParkingTicket ticket) {
        System.out.println("Assigning Ticket to Car :" + getLicenseNumber());
    }
}