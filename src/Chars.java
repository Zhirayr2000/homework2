import java.util.Scanner;

public class Chars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char ch1='S';
        char ch2='T';
        char ch3='v';
        if(Character.toUpperCase(ch1)>=Character.toUpperCase(ch2))
        {
            if(Character.toUpperCase(ch1)>=Character.toUpperCase(ch3))
                System.out.println(ch1);
            else
                System.out.println(ch3);
        }
        else if(Character.toUpperCase(ch2)>=Character.toUpperCase(ch3))
            System.out.println(ch2);
        else
            System.out.println(ch3);
    }
}
