package Main;

import ChapterFour.StringCheck;
import ChapterOne.Basics;

import java.io.FileNotFoundException;
import java.io.IOException;


interface ex {
    public default int getSpeed(){
        return 5;
    }
}
interface ex2 {
    public default int getSpeed(){
        return 10;
    }
}

class A implements ex, ex2{
    A(){
        System.out.println("CP");
    }
    {System.out.println("SP");}
    protected void method(){
        System.out.println("Animal run");
    }

    @Override
    public int getSpeed() {
        return 6;
    }

}

class B extends A {
    B(){
        System.out.println("CT");
    }
    {System.out.println("IT");}
    public final void method(){
        System.out.println("dog runs");
    }
}

public class Main implements interfaceA {
//el static se usa para cuando una variable es accesible
    //para toda la clase
public static int x1;
static String z;
static double d;
static char c;
int y =10;


    public static void main(String args []) throws IOException {
        /*int x = 5, y = 10;//pr1=0b1,pr2=0xf,pr3=018;
        int a = 10;
        Integer wi = 10;
        Double aDouble = 10.0;
        System.out.println(aDouble == a);
        System.out.println(y/=x);
        System.out.println(x1+z);
        long aLong = 0x99;
        System.out.println(aLong);
        final int x1 = 10;
        final int f1 = 0;
        final int f2 = 2;

         */
        //InvertirCadena invertirCadena = new InvertirCadena();

        /*Integer[] a1 = {2,-1,4,5,3};
        Integer[] a2 = {2,-1,4,5,3};

        System.out.println((a1==a2) + "");
        System.out.println(Arrays.equals(a1,a2) + "");
        System.out.println(Arrays.deepEquals(a1,a2)+ "");


        double a=1,b=0,c=2;
        double mod1 = a%b, mod2= b%c;
        double res=mod1>mod2 ? mod1 : mod2;
        System.out.println(res);


        try {
            method();;
        }catch (FileNotFoundException fne){
            System.out.println("fnf");
        } catch (IOException io) {
            System.out.println("IO");
        }

        int x = 0;
        String [] animal = new String[3];

        do {
            animal[x] ="cat"; x++;
        } while (false);
        do {
            animal[x] ="2"; x++;
        } while (x>animal[x++].length());
        do {
            animal[x] ="3";
        } while (x>3);

        for (String a:animal
             ) {
            System.out.println(a);
        }

        int arr[][]={{1,3,5},{7,8}};
        for (int[] a: arr
             ) for (int i:a)

            System.out.println(i + " ");

        for (int j= 0, k=5; j<k; k--);
        for(int j =0; j++ <3;);
        for(int i=0; i<5;i++, System.out.print(i+"hi"));

        StringBuilder s = new StringBuilder("1Z0");
        s.append("-808");
        System.out.println(s.length());
        System.out.println(s.capacity());


        StringBuilder s = new StringBuilder("1Z0");
        StringBuilder s2 = new StringBuilder("1Z0");

        System.out.println(s.toString().equals(s2.toString()));

        //hacer metodo para mostrar todas las formas d eun array


        int[] nums = {0,1,2,3,4};
        for (int x:nums){
            System.out.println(x);
            continue;
            System.out.println(x+Main.x);
        }

        int z = 20;
        while (z>0){
            do {
                z-=2;
            } while (z>5);
            z--;
            System.out.println(z);
        }

                while (z>0){
            int z = 20;
            do {
                z-=2;
            } while (z>5);
            z--;
            System.out.println(z);
        }

                switch (f1+f2){
            case f1 : {System.out.println("A");}
            case 1 : System.out.println("b");
            default : System.out.println("def"); break;
            case f2 : System.out.println("c");
        }

        f1 = 0;
        switch (f1+f2){
            case f1 : {System.out.println("A");}
            case 1 : System.out.println("b");
            default : System.out.println("def"); break;
            case f2 : System.out.println("c");
        }

                if(6>6){
            System.out.println("a");
            System.out.println("b");}
        System.out.println();
            else {
                System.out.println("s");
        }

                System.out.println(""+1+2);
        System.out.println(""+(1+2));

                System.out.println(true ^ (false | true));

        A a = new B();
        a.method();


        int a = 1_000;
        int b = 012;
        int c = 0B01;
        int d = 0X3;

        System.out.println(013);

        final int [] ints = new int[3];
        int len = ints.length;
        ints[1]++;
        for (int i : ints)
            System.out.println(i);


        int [][] ints = new int[3][2];
        ints[0] = new int[3];
        ints[2] = {1,2,3};
        System.out.println(ints[0].length + ints[2].length);

                int [] ints = {2,-1,4,5,3};
        Arrays.sort(ints);
        System.out.println(Arrays.binarySearch(ints,-1));
*/
        int x;
        double aDouble2 = 0.0D;
        x = 10;
        Integer i1 = Integer.decode("10");
        Integer i2 = Integer.decode("20");
        Integer i3 = Integer.decode("30");
        System.out.println(aDouble2);

        if(x==10) x=11;
        System.out.println(x);

        System.out.println(interfaceA.x);


    }

    /**
     *
     * @param i
     */


    public void print(final int i){
        try {
            throw new NullPointerException();
        } catch (ClassCastException e){
            System.out.println("cc");
        } finally {
            System.out.println("final");
        }
        System.out.println("OCA");
    }

    public static void method()throws Exception{
        throw new FileNotFoundException();
    }

    private void ChapterOne(){
        Basics basics = new Basics();
        basics.concepts();
    }

    private void ChapterTwo(){
    }

    private void ChapterThree(){
    }

    public void ChapterFour(){
        StringCheck stringCheck = new StringCheck();
        stringCheck.StringMethods("Juan Perez");
    }

}
