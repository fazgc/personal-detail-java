public class Calculator { // class and classname
    //global static variables
    static int a = 20; //global variable
    static int b = 10; //global variable
    static int addition;//class variable
    static int sub; //class variable
    static  int multiplication; //class variable
    static int division; //class variable
    public static void main(String[] args) {                      //main method
        addition(); subtraction(); multiplication(); division();}  //user defined methods
    //no return type,no parameter user defined method
    static void addition() { addition = a + b;
        System.out.println(addition);}
    //no return type,no parameter,user defined method
    static void subtraction() { sub = a - b;
        System.out.println(sub);}
    //no return type no parameter user defined method
    static void multiplication() { multiplication = a * b;
        System.out.println(multiplication);}
    //no return type on parameter user defined method
    static void division() { division = a/b;
         System.out.println(division);}



            }





