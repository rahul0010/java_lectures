class Methods
{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int add(int a, int b, int c)
    {
        return a + b + c;
    }
    public static void main(String[] args) {
        // Methods m = new Methods();
        int total = add(10,20);
        int newTotal = add(10,20,10);
        System.out.println(total + "\n" + newTotal);
    }
}