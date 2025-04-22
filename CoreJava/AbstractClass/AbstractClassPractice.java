package AbstractClass;

interface NewInterface{
    void interfaceMethod1();
    void interfaceMethod2();
}
// Abstract class can implement interface
// Abstract class can't be made as Final as it will prohibit it from subclassing which is against abstract definition.
abstract class AbstractClass implements NewInterface {

    final String abstractString;

    abstract void abstractMethod();

    // Abstract Class Constructor
    public AbstractClass(String string) {
        System.out.println("This is abstract class constructor");
        this.abstractString = string;
    }

    public void concreteMethod() {
        System.out.println("String is :" + abstractString);
    }

    public static void staticMethod() {
        System.out.println("This is static method of abstract class");
    }

    // Only one method from interface is implemented here.
    public void interfaceMethod1() {
        System.out.println("This is interface method 1");
    }

}

class ImplementingClass extends AbstractClass {

    public ImplementingClass(String string) {
        super(string);
    }

    @Override
    void abstractMethod() {
        System.out.println("This is implementation of abstract method");
    }

    // Implementing method from interface which is implemented by abstract class.
    @Override
    public void interfaceMethod2() {
        System.out.println("This is interface method 2");
    }
}

public class AbstractClassPractice {

    public static void main(String[] args) {
        ImplementingClass implementingClass = new ImplementingClass("Test string"); // This will call abstract class constructor automatically
        implementingClass.abstractMethod(); // This will call overriden abstract method
        implementingClass.concreteMethod(); // This will call concrete method of the abstract class
        AbstractClass.staticMethod(); // Direct call to static method.
        implementingClass.interfaceMethod1();
        implementingClass.interfaceMethod2();
    }
}

