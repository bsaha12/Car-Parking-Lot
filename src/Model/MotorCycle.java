package Model;

public class MotorCycle extends Vehicle {

    public MotorCycle(String licenseNumber) {
            super(licenseNumber);
        }
    
        @Override
    public void assignTicket(ParkingTicket ticket) {
        System.out.println("Assigning Ticket to Motorcycle : " + getLicenseNumber());
    }
    
}
