import java.util.Scanner;

class water1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the water consumption : ");
        int cons=sc.nextInt();
        if (cons<=500) {
            System.out.println("the bill is 100");
    }else{
        System.out.println("the bill is 200");
    }
}
}
    