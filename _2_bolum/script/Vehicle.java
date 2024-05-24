public class Vehicle {
    private String manufacturer;
    private int year;
    private String color;

    public String getManufacturer(){
        return this.manufacturer;
    }
    public void setManufacturer(String value){
        this.manufacturer = value;
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int value){
        this.year = value;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String value){
        this.color = value;
    }
    
    public Vehicle(){
        System.out.println("Vehicle sınıfından bir nesne türetildi.");
    }
    
    public Vehicle(String manufacturer, int year, String color){
        System.out.println("Parametreli Vehicle sınıfından bir nesne türetildi.");
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
    }




    public void start(){
        System.out.println("Araç başlatıldı.");
    }
    public void stop(){
        System.out.println("Araç durduruldu.");
    }
    public void drive(){
        System.out.println("Araç sürüşte.");
    }

    
    @Override
    public String toString() {
        return "Vehicle [manufacturer=" + manufacturer + ", year=" + year + ", color=" + color + "]";
    }




}
