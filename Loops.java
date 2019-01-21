class Loops
{
    public static void main(String[] args) {
        for(int n= 1; n <= 10; n++)
        {
            System.out.println(n);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println("Hello " + i);
            i++;
        }
        do
        {
            System.out.println(i);
            i++;
        }while(i<10);

        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            System.out.print( x );
            System.out.print(",");
        }

        Integer ch = 2;
        switch (ch) {
            case 1:
                System.out.println("This is condition 1");  
                break;

            case 2:
            case 5:
            case 10:
                System.out.println("This is case 10");
                break;

            default:
                break;
        }

        System.out.println(ch.toString());
        String hello = "           Hello World         ";
        System.out.println(hello.trim());

        int[] newNumbers = new int[10];
        newNumbers[0] = 10;

        for(int x : newNumbers)
        {
            System.out.println(x);
        }
         
        int[] even = {2,4,6,8,10};
        for(int x : even)
        {
            System.out.println(x);
        }

        for(int j=0; j <= even.length - 1;j++)
        {
            System.out.println(even[j]);
        }
    }
}