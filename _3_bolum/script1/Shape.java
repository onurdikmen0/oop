public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }

    public abstract void draw();




}
