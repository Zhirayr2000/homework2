import java.util.Scanner;

public class Chars {
    public static void main(String[] args) {
        char ch1='S';
        char ch2='T';
        char ch3='v';
        if((ch1>=97?ch1-32:ch1)>(ch2>=97?ch2-32:ch2))
        {
            if((ch1>=97?ch1-32:ch1)>=(ch3>=97?ch3-32:ch3))
                System.out.println(ch1);
            else
                System.out.println(ch3);
        }
        else if((ch2>=97?ch2-32:ch2)>=(ch3>=97?ch3-32:ch3))
            System.out.println(ch2);
        else
            System.out.println(ch3);
    }
}
