public class Bus extends Vehicle {
    public Bus(){}
    public Bus(String manufacturer, int year, String color){
        super(manufacturer, year, color);
    }

    public void scheduling(){
        System.out.println("Otobüs saatleri programı.");
    }
    
    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("Otobüs sürüşte.");
    }

    
}
