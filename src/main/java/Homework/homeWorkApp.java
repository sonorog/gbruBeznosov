//Безносов Н.Н.

package Homework;
//1 задание
public class homeWorkApp {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSing();
        printColor();
        comprareNumbers();

    }



//2 задание
    public static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //3 задание
    public static void checkSumSing() {
        int a=-20;
        int b=10;
        int c= (a+b);
        if (c>=0) {
            System.out.println("Сумма положительная ");
        }
        else {
            System.out.println("Сумма отрицательная ");
        }
    }
//4 задание
    public static void printColor() {
        int value= 0;
        if (value <=0) {
            System.out.println("Красный");
        }
        if (value >0 && value <=100) {
                System.out.println("Желтый");
        }
        if (value >100) {
            System.out.println("Зелёный");
        }

//задание 5
    }
    public static void comprareNumbers() {
        int a=2;
        int b=5;


        if (a>=b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }

    }
}

