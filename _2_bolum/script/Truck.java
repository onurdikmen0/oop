public class Truck extends Vehicle {
    public Truck(){}
    public Truck(String manufacturer, int year, String color){
        super(manufacturer, year, color);
    }

    public void transport(){
        System.out.println("Taşıma işlemi gerçekleştiriliyor.");
    }

    @Override
    public void drive() {
        System.out.println("Kamyon sürüşte.");
    }

}
