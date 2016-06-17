package Overloading;

class Sample {

    public void display(String name) {
        System.out.println(name);
    }

    public void display(int number) {
        System.out.println( " "+number);
    }
}

public class OverloadingExample {
    public static void main(String args[]) {

        Sample object = new Sample();

        object.display("Hlulani");
        object.display(10);
    }
}
