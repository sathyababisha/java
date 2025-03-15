import java.util.Scanner;
public class scn
{
    public static void main(String[]args)
    {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the username:");
        String username =myobj.next();
        System.out.println("The username is"+username);
    }
}