package UTS;

public class VehicleTest {
    public static void main(String[] args) {
        int liter=3875;
        
        Vehicle vehicle1 = new Vehicle("Motor", 20000);
        Vehicle vehicle2 = new Vehicle("Mobil", 10000);
        
        vehicle1.maker();
        vehicle1.kmPerGallons();
        vehicle2.maker();
        vehicle2.kmPerGallons();
        
        if(vehicle1.kmPerGallons>vehicle2.kmPerGallons){
            System.out.println("Nilai baliknya  = 1");
        }else if (vehicle2.kmPerGallons>vehicle1.kmPerGallons){
            System.out.println("Nilai baliknya  = -1");
        }
           
    }
}
