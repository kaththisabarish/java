import java.util.Scanner;
class Leapyear
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
