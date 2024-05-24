public class Rectangle extends Shape{
    
    public Rectangle(int x, int y){
        super(x, y);
    }

    @Override
    public void draw(){
        System.out.println("Dikdörtgen çizildi değerleri x : "+ getX() + " y : "+ getY());
    }
}
