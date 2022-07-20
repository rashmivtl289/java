import java.util.Scanner;

//package stack;

class stack1{
        
    
    int size,n,top=-1,i;
    
    int [] stack;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter n value");
    n=sc.nextInt();
     stack=new int [size];


    
    int push(int n)
    {
        if(top==-1)
        {
            System.out.println("Stack is full");

        }
        else
        {
            top++;
            top=n;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");

        }
        else
        {
            top--;
        }

    }
    int display()
    {
        if(top==-1){
            System.out.println("Stack is empty");

        }
        else{
             for(i=top;i>=0;i++)
             {
                System.out.println();
             }

        }
    }
}
public class stack{
    public static void main(String[] args) {
        int ch,n;
        boolean op;
        Scanner sc=new Scanner(System.in);
        stack1 s=new stack1();
    while(op)
    {
        System.out.println("Enter your choice\n1.push\n2.pop\n3.display");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                   System.out.println("Enter element to push");
                   n=sc.nextInt();
                   s.push(n);
            
        }

    }



    }
}
    