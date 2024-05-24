public abstract class Player {
    private String name;
    private int score;
    private String move;

    protected String getName(){
        return this.name;
    }
    protected int getScore(){
        return this.score;
    }
    protected String getMove(){
        return this.move;
    }

    protected void setName(String name){
        this.name = name;
    }
    protected void setScore(int score){
        this.score = score;
    }
    protected void setMove(String move){
        this.move = move;
    }

    protected  abstract void chooseMove();//sınıfların hamle attributelarına hamle alır.

}
