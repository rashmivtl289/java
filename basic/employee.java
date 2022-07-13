import java.util.Scanner;

class employee1{
    private int eid;
    private String ename,dsg;
    employee1(int id,String e,String d){
        this.eid=id;
        this.ename=e;
        this.dsg=d;

    }
  
     public void printData()
     {
        System.out.println(eid+"\t"+ename+dsg);

     }
    
    
}
 public class employee
 {
    public static void main(String[] args) {
        int i;
        employee1 [] em=new employee1[4];
        Scanner obj=new Scanner(System.in);
        for(i=0;i<4;i++)
        {
            int id=obj.nextInt();
            String e=obj.next();
            String d=obj.next(); 
            em[i]=new employee1(id,e,d);

        }

         for(i=0;i<4;i++)
         {
         em[i].printData();
         }
    }
 }


