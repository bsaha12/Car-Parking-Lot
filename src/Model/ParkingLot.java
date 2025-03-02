package Model;

public class ParkingLot {
    private String name ;
    private String address ;
    private boolean isFull;

    public ParkingLot(String name , String address){
        this.name = name ;
        this.address = address;
        this.isFull = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle){
        System.out.println("Generating ticket for vehicle: "+ vehicle.getLicenseNumber());

        return new ParkingTicket((int)Math.random()*1000);
    }
}
