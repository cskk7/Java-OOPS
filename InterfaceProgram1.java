interface Car{
    void carInsurance();

    default void carNoInsurance(){
        System.out.println("No Offer available");
    }
}
interface Bike{
    void bikeInsurance();
}
interface Bus{
    void busInsurance();
}
interface Truck {
    void truckInsurance();
}
class Insurance implements Car,Bike,Bus,Truck{
    public void bikeInsurance(){
        System.out.println("Bike insurance");
    }
    public void carInsurance(){
        System.out.println("Car insurance");
    }
    public void truckInsurance(){
        System.out.println("Truck insurance");
    }
    public void busInsurance(){
        System.out.println("Bus insurance");
    }
}
public class InterfaceProg1{
    public static void main(String args[]){
        Insurance purchase = new Insurance();
        purchase.bikeInsurance();
        purchase.busInsurance();
        purchase.truckInsurance();
        purchase.carInsurance();
    }
}

