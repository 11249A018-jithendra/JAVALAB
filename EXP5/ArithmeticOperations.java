import java.util.Scanner;
public class ArithDemo {
    static class Add {
        void addop(int a, int b) {
            System.out.println("Add: " + (a + b));
        }
    }
    static class Sub {
        void subop(int a, int b) {
            System.out.println("Sub: " + (a - b));
        }
    }
    static class Mul {
        void mulop(int a, int b) {
            System.out.println("Mul: " + (a * b));
        }
    }
    static class Div {
        void divop(int a, int b) {
            System.out.println("Div: " + (a / b));
        }
    }
    public static void main(String[] args) {
        Add ad = new Add();
        Sub su = new Sub();
        Mul mu = new Mul();
        Div di = new Div();

        ad.addop(20, 10);
        su.subop(20, 10);
        mu.mulop(20, 10);
        di.divop(20, 10);
    }
}