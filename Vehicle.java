package UTS;

class Vehicle {
    String maker ;
    int kmPerGallons;
    
    Vehicle(String maker,int kmPerGallons){
        this.maker=maker;
        this.kmPerGallons=kmPerGallons;
    }
    
    void maker(){
        System.out.println("Kendaraan        :"+ this.maker);
    }
    int kmPerGallons(){
        System.out.println("Konsumsi         :" +this.kmPerGallons +" kmPerLiters");
        return kmPerGallons;
    }
    int bandingVehicle(int vehicle1, int vehicle2) {
        
        if(vehicle1 < vehicle2) {
            
            return 1;
        }
        else {
            
            return -1;
        }
    }
}

