package Main;

import ChapterFour.StringCheck;
import ChapterOne.Basics;
import Ejercicios.InvertirCadena;
import Ejercicios.Operators;
import static java.util.Arrays.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
int x = y;
//el static se usa para cuando una variable es accesible
    //para toda la clase
static int y = 10;

    public static void main(String args []) throws IOException {
        //InvertirCadena invertirCadena = new InvertirCadena();
        Main main = new Main();
        //main.ChapterOne();

        /*String[] strings = {"N","L","n","O","S"};
        Arrays.sort(strings);
        for (String s: strings
             ) {
            System.out.println(s);
        }*/

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

         */
        short c = 128;
        System.out.println(c);

    }

    public void print(){
        try {
            throw new NullPointerException();
        } catch (ClassCastException e){
            System.out.println("cc");
        } finally {
            System.out.println("final");
        }
        System.out.println("OCA");
    }

    public static void method()throws IOException{
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
        stringCheck.declarations();
    }

}
