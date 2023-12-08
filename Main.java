interface Transport {
    void drive();
}
class TransportCompany{
    Transport createShip(){
        return new Ship();
    }
    Transport createTruck(){
        return new Truck();
    }
    Transport createAirplane(){
        return new Airplane();
    }
}
class Airplane implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive airplane");
    }
}
class Ship implements Transport {

    @Override
    public void drive() {
        System.out.println("Drive ship");
    }
}
class Truck implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive truck");
    }
}
public class Main {

    public static void main(String[] args) {
        TransportCompany transportCompany = new TransportCompany();
        Transport truck = transportCompany.createTruck();
        truck.drive();
        Transport ship = transportCompany.createShip();
        ship.drive();
        Transport airplane = transportCompany.createAirplane();
        airplane.drive();
    }
}
