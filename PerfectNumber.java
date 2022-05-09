import java.util.Scanner;
public class PerfectNumber {

        public static void main(String args[])
        {
            int n,nt=0, sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number: ");
            n=sc.nextInt();
            //int i=1;
            //while(i <= n/2)

            for (int i=1; i<=n/2; i++)
            {
                if(n % i == 0)
                {
                    System.out.println(i);
                    sum = sum + i;
                }
               // int nt=0;
                nt = nt + i;
              //  i++;
            }
            if(sum==n)
            {
                System.out.println("The Total of factors is : "+sum);
                System.out.println(n+" is a perfect number.");
            }
            else{
                System.out.println(n+" is not a perfect number.");
                System.out.println("The Total of factors is : "+nt);
            }
        }
}
