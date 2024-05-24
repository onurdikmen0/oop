import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    
    private String name;
    private float price;
    private int quantity;

    public String getName(){
        return this.name;
    }
    public void setName(String value){
        if(value.length() >= 3 && value.length() <= 8){
           this.name = value; 
        }
        else{
            System.out.println("Ürün isim alanı (name) en az 3 ve en fazla 8 karakter olmalıdır. Lütfen tekrar giriş yapınız.");
        } 
    }

    public float getPrice(){
        return this.price;
    }
    public void setPrice(float value){
        if(value >= 0){
            this.price = value;
        }
        else{
            System.out.println("Ürün fiyat (price) değeri minimum 0 olabilir. Lütfen tekrar giriş yapınız.");
        }
    }

    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int value){
        if(value >= 1){
           this.quantity = value; 
        }
        else{
            System.out.println("Ürün adet (quantity) değeri minimum 1 olabilir. Lütfen tekrar giriş yapınız.");
        }
    }

    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Product(){}
    public Product(String name) {
        this.name = name; 
    }
    public Product(String name, float price) {
        this.name = name;
        this.price = price; 
    }
    public Product(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;   
    }

    public void constructorInfo(){
        System.out.println(this.name + " nesnesi oluşturuldu. Tarih bilgisi " + sdf.format(date));
    }



    public double get_total_price(){
        return this.price * this.quantity;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    
}


