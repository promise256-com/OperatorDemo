
public class OperatorDemo{
    int a = 11;
    int b = 22;
    int c = 15;

    void increment () {
        if (a < b) {
            c++;
        }
    }

    void decrement() {
        if (c > 0) {
            c--;
        } else {
            c = 3;
        }
    }

    void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Initial value of c: 15");

        increment();
        System.out.println("After increment, c = " + c);

        decrement();
        System.out.println("After decrement, c = " + c);
    }

    public static void main(String[] args) {
        OperatorDemo obj = new OperatorDemo();
        obj.display();
    }
}

