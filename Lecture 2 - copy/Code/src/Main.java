class SWE {
    String name;
    int id;
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public SWE(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class c39 extends SWE{
    String portfolio;


    public c39(String name, int id, String portfolio) {
        super(name, id);
        this.portfolio = portfolio;
    }


    public int getId() {
        return 21;
    }

    public String getPortfolio() {
        return portfolio;
    }
}
public class Main {
    public static void main(String[] args) {
        c39 var = new c39("Abrar",24,"Abc");

        System.out.println(var.name);


    }
}


//Code 2
//public class Main {
//    public static void main(String[] args)
//    {
//        System.out.println('j' + 'a' + 'v' + 'a');
//    }
//}



//Code 3



//class Animal {
//    public void makeSound() {
//        System.out.println("Animal makes a sound");
//    }
//}
//
//class Dog extends Animal {
//    // Typo in method name, not using @Override
//    @Override
//    public void makeSound() {
//        System.out.println("Dog barks");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal myAnimal = new Animal();
//        Animal myDog = new Dog();
//
//        myAnimal.makeSound(); // Output: Animal makes a sound
//        myDog.makeSound();    // Output: Animal makes a sound (not overridden due to typo)
//    }
//}




//class First
//{
//    public First() { System.out.println("a"); }
//}
//
//class Second extends First
//{
//    public Second() { System.out.println("b"); }
//}
//
//class Third extends Second
//{
//    public Third() { System.out.println("c"); }
//}
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Third c = new Third();
//    }
//}

