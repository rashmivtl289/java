public class enumaration {
    enum DayOfWeek
    {
        monday(1),tuesday(2),wednesday(3),thursday(4),friday(5),saterday(6),sunday(7);
        public int val;

        DayOfWeek(int val)
        {
            this.val=val;
        }
        boolean isWorkDay()
        {
            if(val<6)
            return true;
            else 
            return false;

        }
    }
    public static void main(String[] args) {
        //DayOfWeek day;
        System.out.println("verification of  sunday(isWorkDay())");
        System.out.println(DayOfWeek.sunday.isWorkDay());
        System.out.println("verification of  wednesday(isWorkDay())");
        System.out.println(DayOfWeek.wednesday.isWorkDay());
        System.out.println("verification of  saterday(isWorkDay())");
        System.out.println(DayOfWeek.saterday.isWorkDay());
    }


    
}
