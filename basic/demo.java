import java.util.Scanner;

class student{
         private int usn;
         private String name;
         student(int u,String n){
            this.usn=u;
            this.name=n;
         }
          public void printData()
          {
            System.out.println(usn+"\t"+name);
          }  
         }
     public class demo {
        public static void main(String[] agrs){
            int i;
            student [] s=new student[3];
            Scanner obj=new Scanner(System.in);
            for(i=0;i<3;i++)
            {
                int u=obj.nextInt();
                String n=obj.next();
                s[i]=new student(u,n);
            }
            for(i=0;i<3;i++)
            {
                s[i].printData();
            }

        
            
        
        }
     }
    

