

import java.util.Scanner;
class pushpull{
    public int top=-1;
    public int []a= new int[20];
    public int max=5;
    public void push(int n){
        top+=1;
        a[top]=n;
        // System.out.println(a[top]);
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        top-=1;
    }
    public void display(){
        System.out.println("Stach elements are : ");
        for (int i = top; i >=0; i--) {
            System.out.println(a[i] +" ");
        }
    }
}

public class stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pushpull ob=new pushpull();
        int ch,n;
        boolean loop=true;
        while(loop){
            System.out.println("1.Push 2.Pull 3.Display 4.Exit");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                if(ob.top==ob.max-1){
                    System.out.println("Size is full");
                    break;
                }
                System.out.println("Enter a number to push");
                n=sc.nextInt();
                ob.push(n);
                break;

                case 2:ob.pop();
                break;

                case 3:ob.display();
                break;

                case 4:loop=false;
                break;
                default:         
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}
