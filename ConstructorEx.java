/**
 * ConstructorEx
 */
class Constructor 
{
    private int num;
    Constructor()
    {
        this.num = 140;
    }

    Constructor(int num)
    {
        this.num = num;
    }

    int getNum()
    {
        return this.num;
    }
}

/**
 * ConstructorEx
 */
public class ConstructorEx {

    public static void main(String[] args) {
        Constructor con = new Constructor();
        Constructor con1 = new Constructor(355);
        System.out.println("Non Parameterized Constructor: " + con.getNum());
        System.out.println("Parametrized Contructor: " + con1.getNum());
    }
}