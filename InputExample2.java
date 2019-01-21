/**
 * InputExample2
 */
import java.io.*;
public class InputExample2 {

    public static void main(String[] args) throws Exception{
        // InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        
        System.out.println("Enter any number");  
        int num=Integer.parseInt(br.readLine());
        System.out.println(num);  
    }
}