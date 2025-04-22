package Java8.MethodReference.ConstructorReference;

@FunctionalInterface
interface MathInterface
{
    void mathOperation(int a, int b);
}

class AdditionClass{
    public AdditionClass(int x, int y) {
        System.out.println("Result of this Math Operation is "+ (x+y));
    }
}

class SubtractionClass{
    public SubtractionClass(int x, int y) {
        System.out.println("Result of this Math Operation is "+ (x-y));
    }
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        MathInterface mathInterface = AdditionClass::new;
        mathInterface.mathOperation(10, 20);

        MathInterface mathInterface1 = SubtractionClass::new;
        mathInterface1.mathOperation(20,10);
    }
}
