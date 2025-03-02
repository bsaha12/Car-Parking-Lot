package Model;

public abstract class ParkingSpot {
    private int id ;
    private boolean isFree ;

    public ParkingSpot(int id ){
        this.id = id ;
        isFree = false ;
    }
    public boolean isFree() {
        return isFree;
    }
    public void setFree(boolean isFree) {
        this.isFree = isFree;
    }
    
}
