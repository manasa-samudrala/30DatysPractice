import java.util.Scanner;
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("hello world");
        Scanner s = new Scanner(System.in);
        System.out.println("enter the lower range");
        int lr = s.nextInt();
        System.out.println("enter the upper range");
        int ur = s.nextInt();
    }
}
