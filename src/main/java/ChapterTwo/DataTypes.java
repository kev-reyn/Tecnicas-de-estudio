package ChapterTwo;
import static Main.Main.x1;
public class DataTypes {
    //DATA TYPES
    //Class level variables must be declared and initialized at same time
    //if you declare a variable without initializing it, the compiler will
    //set the variable to a reasonable default value based on its type

    // DEFAULT VALUES FOR EACH PRIMITIVE VARIABLE TYPES
    byte aByte = 0;
    short aShort = 0;
    int anInt = 0;
    long aLong = 0;

    float aFloat = 0.0f;
    double aDouble = 0.0;
    // OR
    double aDouble2 = 0.0D;
    double z= aDouble2+anInt;

    char aChar = '\u0000'; //Must be whit ' ' and not " "

    Boolean aBoolean = false;

    Object object = null;




    public void myMethod(){
        System.out.println(x1);
        Character.valueOf('s');
    }

}
