public class Triangle extends Shape {

    public Triangle(int x, int y){
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("Üçgen çizildi değerleri x : "+ getX() + " y : "+ getY());
    }

}
