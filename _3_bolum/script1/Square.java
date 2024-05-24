public class Square extends Rectangle {

    public Square(int x){
        super(x, x);
    }

    @Override
    public void draw(){
        System.out.println("Kare çizildi değeri x : "+ getX());
    }


}
