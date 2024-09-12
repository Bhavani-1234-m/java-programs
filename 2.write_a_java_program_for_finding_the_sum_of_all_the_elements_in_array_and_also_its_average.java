import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        int sum=0,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to store:");
        int n=sc.nextInt();
        int array[]=new int[10];
        System.out.println("Enter the sum of elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("the sum of elements in the array:");
        {
            for(int i=0;i<n;i++)
            {
                sum=sum+array[i];
            }
            avg=sum/n;
            System.out.println(sum);
            System.out.println(avg);
        }}
        }
