import java.util.Scanner;

class datatypes1
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter no of family numbers");
     int mem=sc.nextInt();
     System.out.print("enter water consumed in litres");
     int consumed=sc.nextInt();
     System.out.print("enter house number");
     int num=sc.nextInt();
     System.out.print("enter water usage status");
    int usage=sc.nextInt();


    System.out.println("family members are "+ mem);
    System.out.println("water consumed is "+ consumed);
    System.out.println("house number is "+ num);
    System.out.println("family members are "+ mem);
    System.out.println("water usage status is "+ usage);
  }
}




