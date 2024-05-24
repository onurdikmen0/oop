public class Program {
    // @SuppressWarnings("unused")
    @SuppressWarnings("unused")
    public static void main(String[] args){
        /*          Contructorların hiyerarşik yapısını anlamak için çalıştır. 
        Vehicle vehicle1 = new Vehicle("Skoda",2022,"Green");
        System.out.println("Vehicle " + vehicle1.getManufacturer());

        Car car1 = new Car();
        car1.setManufacturer("TOGG");
        System.out.println(car1.getManufacturer());

        Car car2 = new Car("Opel", 2020, "Black");
        car2.setManufacturer("TOGG");
        System.out.println(car2.getManufacturer());
        */

        // Truck truck = new Truck("Man",2024,"black");
        // System.out.println(truck.getManufacturer());
        // truck.transport();

        // Bus bus = new Bus("Skoda",2020,"white");
        // System.out.println(bus.getColor());


        // SchoolBus schoolBus = new SchoolBus("America", 1997, "Yellow");
        // System.out.println(schoolBus.getColor());
        // schoolBus.scheduling();
        // schoolBus.getFare();



        Vehicle vehicle = new Vehicle("Skoda",2022,"Green");
        Car car = new Car("Toyota", 2020, "Black");
        Truck truck = new Truck("Man",2024,"black");
        Bus bus = new Bus("Mercedes",2020,"white");
        SchoolBus schoolBus = new SchoolBus("Volvo", 1997, "Yellow");

        System.out.println(" ");
        System.out.println(vehicle.getColor());
        System.out.println("sdfsf ");
        vehicle.setColor("Beyaz");
        // // vehicle.drive();
        // schoolBus.drive();
        // car.drive();
        // bus.drive();
        // truck.drive();
        // vehicle.toString();


        // Vehicle a = new Car("BMW", 2024, "Black");
        // System.out.println();
        // a.drive();


        // System.out.println();
        // Vehicle[] vehicles = new Vehicle[]{car, truck, bus, schoolBus};

        // for (Vehicle v : vehicles) {
        //     v.drive();
        // }


        // System.out.println(vehicle);
        // System.out.println(vehicle.toString());


        // Vehicle arac = new Truck();
        // arac.drive();

        // speakTry(new Bus());

        

    }

    public static void speakTry(Vehicle vehicle){
        vehicle.drive();
    }

    
    
}
