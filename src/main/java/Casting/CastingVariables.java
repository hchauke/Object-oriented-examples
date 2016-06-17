package Casting;

public class CastingVariables {

    public static void main(String[] args) {
        int age = 40;
        String name = "Martin";
        Object surname = "luther king";

        System.out.println("Converting Integer to String");
        returnString(age);

        System.out.println("Converting String to Integer");
        returnInteger(name);

        System.out.println("Down-casting surname of type Object to String");
        downCasting(surname);

        System.out.println("Up-casting name of type String to type Object");
        upCasting(name);

    }

    public static void returnString(int age){
        String years = Integer.toString(age);

        System.out.println("Result is: " +years+ "\n") ;
    }

    public static void returnInteger( String name){
        String knownAs = String.valueOf(name);

        System.out.println("Result is: " +knownAs+ "\n");
    }

    public static void downCasting(Object surname){
        String cast = (String) surname;

        System.out.println("Result is: " +cast+ "\n");
    }

    public static void upCasting(String name){
        Object cast = (Object) name;

        System.out.println("result is: " +cast+ "\n");
    }
}
