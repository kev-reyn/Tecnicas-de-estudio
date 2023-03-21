package ChapterFour;

//THE STRING CLASS IS IMMUTABLE

//The class String stores its values in a private variable of the type char array
//(char value[]). Arrays are fixed in size and don’t grow once initialized.

//This value variable is marked as final in the class String. Note that final is a
//non-access modifier, and a final variable can be initialized only once.

import java.util.Arrays;
import java.util.List;

//None of the methods defined in the class String manipulate the individual elements
//of the array value.
public class StringCheck {

    int a;

    public StringCheck(){

    }

    //Because String is a class,
    // you can assign null to it,
    // as shown in the next example:
    String example = null;
    //null is a literal
    //value for objects

    public void declarations(){
        //Aqui se establece el package al que pertenece String que es
        //Java.lang.String.
        java.lang.String javaLangString = "Hello world from java.lang.String!";
        //Aqui solo se usa String aunque establece lo mismo.
        String string = "Hello world String!";

        //Create String objets by using '=' equal operator
        //You can also assign null value

        System.out.println("-------- 2 difrentes declaraciones de String =========="); //Also enclosing within double quotes you can create a new String Object
        System.out.println(javaLangString + " ::: " + string);

        System.out.println("\n-------- 2 difrentes declaraciones de String with a same Value ==========");
        String string1 = new String("Im a String Object"); // <- This is the String Constructor
        String string2 = "Im a String Object";
        System.out.println(string1 + " ::: " + string2);
        //Same value but different objects

        //Para comparar el valor de los String se utiliza el metodo Equals(),
        //Si se utiliza == el comparador de variables primitivas solo
        //va a comprar las direcciones
        System.out.println("\n-------- Comparation of the last 2 string ==========");
        System.out.print("Comparation with == primitive: ");
        System.out.println(string1 == string2);
        System.out.println("Comparation with equals method: " + string1.equals(string2));

        System.out.println("\n-------- String constructor aso accepts a char Array ==========");
        char[] charArray = new char[]{'h','o','l','a',' ','f','r','o','m',' ','c','h','a','r'};
        String stringByChar = new String(charArray);
        System.out.println(stringByChar);
    }

    public void stringBuilderAndBuffer(){
        //You can also create objects of String using the classes StringBuilder and
        //StringBuffer:

        //Both string constructor
        //that accepts object
        //of StringBuilder and String Buffer
        StringBuilder stringBuilder1 = new StringBuilder("String Builder");
        String string1 = new String(stringBuilder1);
        StringBuffer stringBuffer1 = new StringBuffer("String Buffer");
        String string2 = new String(stringBuffer1);
        
        String[] strings = {"N","L","n","O","S"};
        Arrays.sort(strings);
        for (String s: strings
             ) {
            System.out.println(s);
        }
    }

    public void StringMethods (String stringToSplit){
        //String[] splitedString = stringToSplit.split(" ");
        //List<String> list = Arrays.asList(splitedString);

        List<String> list = Arrays.asList(stringToSplit.split(" "));
        System.out.println(list.get(0));


    }
}
