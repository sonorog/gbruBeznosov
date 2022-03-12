package homeWork2;

public class homework2 {
    public static void main(String[] agrs) {

       System.out.println(within10and20(2,3));

       xpositiveornot(0);

       System.out.println(isnegative(3));



    }

    public static boolean within10and20(int x1, int x2) {
        int summ = x1 + x2;
        return ((summ >10)&(summ <=20));

    }

    public static void xpositiveornot(int x) {
        if (x < 0) {
            System.out.println("передано отрицательное число");
        }
        else {
            System.out.println("передано положительное число");
        }




    }
    public static boolean isnegative (int a) {
        if (a < 0)
        {
            return true;
        }else{
            return false;
        }

    }
}




