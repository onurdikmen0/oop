public class MathHelper {
    public static int add(int a, int b){
        return a + b;
    }
    public static int substract(int a, int b){
        return a - b;
    }
    public static int multipy(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        if(b == 0){
            System.out.println("b, 0'a eşit olamaz.");
        }
        return a / b;
    }
}
