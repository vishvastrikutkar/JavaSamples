package Java8.MethodReference;

interface NumberOperations {
    int operation(int a, int b);
    }

class AdditionOperation{

    public static int addNumberStatic(int a, int b) {
        return a+b;
    }

    public int addNumbersInstance(int a, int b) {
        return a+b;
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {

        // Static Method Reference
        NumberOperations numberOperations = AdditionOperation::addNumberStatic;
        System.out.println(numberOperations.operation(1,3));

        /* With Lambda Expression
         NumberOperations numberOperations1 = (a,b)->{
             return AdditionOperation.addNumberStatic(a,b);
         };
         System.out.println(numberOperations1.operation(1,3));*/

        // Instance Method Reference
        AdditionOperation additionOperation = new AdditionOperation();
        NumberOperations numberOperations1 = additionOperation::addNumbersInstance;
        System.out.println(numberOperations1.operation(1,3));
    }
}
