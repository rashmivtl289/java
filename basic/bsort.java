import java.util.Scanner;

public class bsort {
    public static void main(String[] args) {
        int a[],i,j,min;
        int n;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of value");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter array value");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
        for(j=0;j<n-1;j++)
        {
        if(a[i]>a[j+1])
        {
        min=a[j];
        a[j]=a[j+1];
        a[j+1]=min;
        }
    }
}
    System.out.println("Sorted array:\n");
    for(i=0;i<n;i++)
    System.out.println(a[i]);



        
        


        
    }
    
}
