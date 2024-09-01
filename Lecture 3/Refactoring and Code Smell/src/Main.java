//public class Main {
//    public static void main(String[] args) {
//        int value = 23;
//        assert value >= 20 : " Underweight";
//        System.out.println("value is " + value);
//
//    }
//}














// day can not be negetive.,
// b= 2147483647
// b=b+1

class A {
    String n, add;

    public String getN() {
        return n;
    }

    public String getAdd() {
        return add;
    }

    public void setN(String n) {
        this.n = n;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
class cust extends A{

}



public class Main {
    public static boolean fun1(int a, int b)
    {
        if(a>2)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {

        //per day fine, total day, reduction
        int a=10,b = 3, r = 13;

        if(fun1(b,a))
        {
            System.out.println("Fined");
        }
        else
        {
            System.out.println("Not Fined");
        }
        int f = (a*b)-r;

        //Printing Fines
        System.out.println(f);


        cust dm1 = new cust();

        dm1.setN("Abrar");
        dm1.setAdd("Mirpur");

    }
}
