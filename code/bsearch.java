

import java.util.Scanner;

public class bsearch {
    public static void main(String[] args) {
        int []a;
        int key,mid,low,high,n;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the array Array elements");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        low=0;
        high=n-1;
        System.out.println("Enter the search element");
        key=sc.nextInt();
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid] == key){
                System.out.println("Key element found at " + mid +"location");
                flag=true;
                break;
            }
            else if(key>a[mid]){
                low=mid;
            }
            else{
                high=mid;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
    }
}
