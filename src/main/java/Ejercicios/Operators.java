package Ejercicios;

public class Operators {

    public void assignamentOperators(){
        double myDouble2 = 10.2;
        System.out.println("Doblue assign: " + myDouble2);
        int a = 10;
        int b= a;
        System.out.println("assign variables of same type a assing to b[int]: " + b);
        float float1 = 10.2F;
        float float2 = float1;
        System.out.println("Float assignament: " + float2);
        b += a;
        System.out.println("b is assigned a value\n" +
                "of 20. b = 10 + 10. :::::: b: " + b);
        a = b = 10;
        b -= a;
        // el libro tiene un error en esta pagina, pagina 88
        System.out.println("Reassign\n" +
                "a value of\n" +
                "10 to both\n" +
                "variables\n" +
                "a and b AND b is assigned a value\n" +
                "of 0. b = 20 – 10. :::: b: " + b);
        a = b = 10;
        b *= a;
        System.out.println("Again reasing the value" +
                "of both AND b is assigned a value\n" +
                "of 100. b = 10 * 10.:::: b: " + b);
        a = b = 10;
        b /= a;
        System.out.println("Again reasing the value" +
                "of both AND b is assigned a value\n" +
                "of 1. b = 10 / 10.:::: b: " + b);
    }
}
