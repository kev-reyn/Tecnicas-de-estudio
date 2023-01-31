package ChapterOne;

public class Basics {
    public void mainDeclaration(){
        System.out.println("A main method must be declared like this:\n\npublic static void main(String[] args){\n" +
                "code goes here...\n" +
                "}");
        System.out.println(" ---- Use javac nameOfProgram.java to execute it ---- \n");
        System.out.println(" ---- javac compiler consume the source code and produces bytecode ---- \n");
        System.out.println(" ---- if a java file is trying to be compiled \n" +
                "must use the name as the public class declared within it and containing a valid main method\n" +
                "if not like this code will get a compilation fail it and containing a valid main method ---- \n");
        System.out.println(" ---- when launching a program from the commando line \n" +
                "just use the name of the main class without any extension ---- \n");
    }

    public void concepts(){
        System.out.println("Inheritance: A class uses fields and methods of another class\n");
        System.out.println("Polymorphism: Subclasses of a class can define their own unique behavior,\n" +
                "yet share some of the same functionality of the parent class\n");
        System.out.println("Abstraction: Hiding certain details and showing only essential features of the object\n");
        System.out.println("Ecapsulation: Wrapping data and the code that operates on the data\n" +
                "into a single entity");
        System.out.println("Java buzzwords: \n" +
                "Simple\n" +
                "Object orientes\n" +
                "Distributed\n" +
                "Interpreted\n" +
                "robust\n" +
                "secure\n" +
                "architecture neutral\n" +
                "plataform independent\n" +
                "high performace\n" +
                "multithreaded\n" +
                "dynamic");
    }

    public void classStructure(){

    }
}
