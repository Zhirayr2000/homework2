import java.util.Scanner;

public class HomeworkNo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int var1=scanner.nextInt();
        System.out.println("Enter second number:");
        int var2=scanner.nextInt();
        if(var1>var2)
            System.out.println("First is bigger");
        else if(var1==var2)
            System.out.println("They are equal");
        else
            System.out.println("First is smaller");
    }
}
