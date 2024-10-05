import java.util.Scanner;
//class EntryKiosk
//main()
//num age
//OUTPUT “Enter your age: ”
//INPUT age
//if age >= 21 then
//OUTPUT “You get a wristband.”
//return
//end class
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
            if(age >= 21)
            {
                System.out.println("You get a wristband.");
            }
        }
    }
}