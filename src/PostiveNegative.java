import java.util.Scanner;

public class PostiveNegative {
    public static void main(String[] args){
        Scanner getnum = new Scanner(System.in);
        System.out.println("Test the Data");
        int userinput = getnum.nextInt();
        if(userinput < 0)
        {
            System.out.println("The number is Negative");
        }
        else if(userinput > 0)
        {
            System.out.println("The Number is Postive");
        }
        else
            {
                System.out.println("The number is Zero");
            }

    }
}
