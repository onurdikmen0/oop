public class SchoolBus extends Bus {
    public SchoolBus(String manufacturer, int year, String color){
        super(manufacturer, year, color);
    }

    public void getFare(){
        System.out.println("Ücret alma fonksiyonu.");
    }

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("Okul otobüsü sürüşte.");
    }
   
}
