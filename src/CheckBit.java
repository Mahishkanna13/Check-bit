import java.util.Scanner;

public class CheckBit {
    public static int check(int number1,int number2)
    {
        String result="",reverse="";
        int b=0;
        while(number1>0)
        {
            if(number1>=2)
            {
                result+=number1%2;
            }
            else {
                result+=number1;
            }
            number1=number1/2;
        }
        for(int i=result.length()-1;i>=0;i--)
        {
            reverse+=result.charAt(i);
        }
        for(int i=0;i<reverse.length();i++)
        {
            if(Integer.parseInt(String.valueOf(reverse.charAt(i)))==1)
            {
                b=1;
            }
            else {
                b=0;
            }
        }
        return b;
    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Number1= scanner.nextInt();
        int Number2= scanner.nextInt();
        System.out.println(check(Number1,Number2));
    }
}
