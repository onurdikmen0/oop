public class Car extends  Vehicle {
    
    public void openSunroof(){
        System.out.println("Açık açılır tavan.");
    }

    public Car(String manufacturer, int year, String color) {
        super(manufacturer, year, color);
        System.out.println("Parametreli Car sınıfından bir nesne türetildi.");
    }

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("Araba sürüşte.");
    }

    



}
