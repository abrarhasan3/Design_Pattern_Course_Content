class A {
    int a;
    float b;

    public void print()
    {
        System.out.println(a+" "+b);
    }
    A()
    {
        this.a = 10;
        this.b = (float) 11.5;
    }
    A(int a, float b, String s)
    {
        this.a = a;
        this.b = b;
        System.out.println("Constructor 2 Called "+ s);
    }
}

public class Main {

    public static void main(String[] args) {
        A obj1 = new A();

        A obj2 = new A(1,(float) 2.5, "HI");


        obj1.print();

        obj2.print();

    }
}