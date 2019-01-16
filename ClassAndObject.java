/**
 * ClassAndObject
 */
// class SomeClass
// {
    
//     int data = 25;

//     int display()
//     {
//         return data;
//     }

//     void displayWelcome()
//     {
//         System.out.println("Welcome to java.");
//     }
// }

public class ClassAndObject {
    int data = 25;

    int display()
    {
        return data;
    }

    void displayWelcome()
    {
        System.out.println("Welcome to java.");
    }
    public static void main(String[] args) {
        ClassAndObject cls = new ClassAndObject();
        System.out.println(cls.data);
        System.out.println(cls.display());
        cls.displayWelcome();
    }
}