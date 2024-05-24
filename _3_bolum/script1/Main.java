public class Main {
    public static void main(String[] args){
        Shape[] shapes = {new Triangle(7, 4), new Rectangle(15, 19), new Square(20)};
        for (Shape shape : shapes) {
            shape.draw();
        }
    } 
}
