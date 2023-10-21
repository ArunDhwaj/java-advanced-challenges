package com.sbp.advanced.java.challenges.challenges1;

import lombok.extern.slf4j.Slf4j;
import com.sbp.advanced.java.challenges.challenges1.Person4.*;
import org.springframework.web.util.pattern.PathPattern;

//import static com.sbp.advanced.java.challenges.challenges1.Element.SODIUM;

@Slf4j
public class StatementsOperatorsExceptions {

    public void statementsOperatorsExceptions(){
//        challenge1();
//        challenge2();
//        challenge3();
//        challenge4();
//        challenge5();
//        challenge8();
//        challenge11();
//        challenge12();
        challenge13();
    }

    private void challenge1() {
        log.info( "" +  check(50));
        log.info( "" +  check(51));
    }
    /*
    Ch-1: What type does the below method return at runtime?
    Ans: It return Boolean.
     */
    private Object check(int x) {
        int y = 50;
        return x == y;
    }

    /*
    Ch-2: What would be the output of this program?
    Ans:
    i) "Looking out my window"
    ii) "A truly lovely sight."
    */
    private void challenge2(){

        Integer value1 = new Integer(5);
        Integer value2 = value1;
        int value3 = 5;
        Integer value4 = value2;
        value4 = 7;

        //true: Values are equal in both object
        if (value1.equals(value2)) {
            System.out.println("Looking out my window");
        }

        //true: Both object value1 and value2 have same memory address.
        if (value1 == value2) {
            System.out.println("In October's golden light,");
        }

        //true: value1 is object, value3 is primitive type.
        // So, when compared with == operator, both value1 dereferenced and its value compared with value3, which are equal.
        if (value1 == value3) {
            System.out.println("I see a beauty unsurpassed,");
        }

        //false: value2=5, value4=7 ==> not equal
        if (value2.equals(value4)) {
            System.out.println("Wind their way up through the hills.");
        }

        //false: Reference are not equal
        log.info("value4:==> " + value4);
        log.info("new Integer(7):==> " + new Integer(7) );
        log.info("value4 == new Integer(7):==> " + (value4 == new Integer(7)) );

        //false: value4 is object
        // right side also object, which jas different memory location.
        // As both left and right side are object so, "==" operator compare their memory addressed they are not dereferenced.
        // So, when compared with == operator, both value1 dereferenced and its value compared with value3, which are equal.

        Integer value5 = new Integer(7);
//        if (value4 == value5) {
        if (value4 == new Integer(7)) {
            System.out.println("Forewarn of winter chills,");
        }

        //true: Values are not equal
        if(value4.equals(new Integer(7))){
            System.out.println("A truly lovely sight.");
        }

    }

    private void challenge3(){
        /*
        This code will indeed not compile because the static nested class Address does not have access to the hidden field that belongs to the Person class.
        Only non-static nested classes have access to their outer class members.
        >>>
        java: non-static variable hideAddress cannot be referenced from a static context
        <<<<
        */
        Person.Address address = new Person.Address();
        Person person = new Person();
//        Address address = new person.Address();
    }

    private void challenge4(){
        /*
        This code will indeed not compile because the static nested class Address does not have access to the hidden field that belongs to the Person class.
        Only non-static nested classes have access to their outer class members.
        >>>
        java: non-static variable hideAddress cannot be referenced from a static context
        <<<<
        */

        //java: an enclosing instance that contains com.sbp.advanced.java.challenges.challenges1.Person4.Address4 is required
        //Address4 address = new Address4();

        Person4 person4 = new Person4();
        Address4 add = person4.new Address4();

    }

    private void challenge5(){
        /*
        */

        System.out.printf("%s, %s, %s", Element.HELIUM.toString(), Element.HELIUM.chemicalSymbol(), Element.HELIUM.naturalState());
        System.out.println("");

        Element.HELIUM.setTest("Bitter");
        Element.SODIUM.setTest("Bitter2");

        System.out.printf("%s, %s, %s", Element.HELIUM.toString(), Element.HELIUM.chemicalSymbol(), Element.HELIUM.test());
        System.out.println("");
        System.out.printf("%s, %s, %s", Element.SODIUM.toString(), Element.SODIUM.chemicalSymbol(), Element.SODIUM.test());
        System.out.println("");

    }

    private void challenge8() {

        /*
        An anonymous class has access to all the enclosing class members. So totalNumberOfConnectors is accessible within
        the connect() and disconnect() methods.
        Any final local variables are also accessible so the databaseAddress can be accessed.

        Any effectively final local variables are also accessible. An "effectively final" variable is one whose value
        is never changed after it is initialized.

        Since portNumber is an argument that is not modified within the method, it is effectively final and hence
        accessible within those methods.

        Mutable local variables cannot be accessed within the anonymous class, that is why the i variable cannot be
         accessed inside the connect() and disconnect() methods.
        */

        log.info("challenge8");
        DatabaseConnectorFactory databaseConnectorFactory = new DatabaseConnectorFactory();
        databaseConnectorFactory.createConnectors(8080, "localhost", 5);
    }

    private void challenge11() {
//       What is the execution output of the following code?
        String[][] names = {
            {"Alice", "John", "Bob"},
//            {"Charlie", "Bill", "Ben", "John"},
                {"Charlie", "Bill", "Ben", "Sbp"},
            {"John", "Brian", "John"}
        };
        String result = filter(names, "John");
        System.out.println(result);
    }
    private String filter(String[][] names, String name) {
        StringBuilder builder = new StringBuilder();

        for (int row = 0; row < names.length; ++row) {
//            for (int col = 0; col < names[0].length; ++col) {
            for (int col = 0; col < names[row].length; ++col) {
                if (names[row][col].equals(name)) {
                    continue;
                }
                builder.append(names[row][col] + " ");
            }
        }
        return builder.toString();
    }

    private void challenge12() {
        /*
        Explanation: In the above code, the last return statement (return -2;) becomes an unreachable statement.
        The java compiler throws a compilation error java: unreachable statement whenever there is unreachable code.
         */

        System.out.println(divide(10, 2));
        // output >>
        //FinallyBlock
        //-1

        System.out.println(divide(10, 0));
        // output >>
        //ArithmeticException
        //FinallyBlock
        //-1
    }

    private int divide(int num1, int num2) {

//        int result = 0;
        try {
            return num1 / num2;
//            result = num1/num2;

        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException");
            return 0;
//            result = 0;
        }
        finally {
            System.out.println("FinallyBlock");
            return -1;
//            result = -1;
        }

//        return -2;
    }

    private void challenge13() {
        /*
        This is a valid code as per Java specification. And the return value specified in the finally block overrides
        the one from try/catch. But it is not suggested to use a return value inside finally.
        It should only be used to close files, streams, or other resources to avoid leaks.
        */

        System.out.println(divide2(10, 2));
        // output >>
        //FinallyBlock
        //-1

        System.out.println(divide2(10, 0));
        // output >>
        //ArithmeticException
        //FinallyBlock
        //-1
    }

    private int divide2(int num1, int num2) {
        try {
            System.out.println("try");
            return num1 / num2;
        }
        catch (ArithmeticException ae) {
            System.out.println("ArithmeticException");
            return -10;
        }
        finally {
//            return -11;
            System.out.println("FinallyBlock");
        }
    }

}
