package boxingUnboxingWrapper95;

public class Programa {
    public static void main(String[] args) {

        //BOXING
        int x = 20;
        Object obj = x;
        //Integer obj = x;
        System.out.println(obj); // 20

        //UNBOXING
        int y = (int) obj;
        //int y = obj;
        System.out.println(y); // 20

        //WRAPPER - trata os tipos primitivos como classes
        //EXP: Integer, Short, Float, Boolean, Double...
    }
}
