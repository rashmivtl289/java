import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
    int []a;
    a=new int[3];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array values");
    for(int i=0;i<3;i++)
    a[i]=sc.nextInt();
    System.out.println("Print array values");
    for(int i=0;i<3;i++)
    System.out.println(a[i]);


    }
}
    

