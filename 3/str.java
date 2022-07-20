class str{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("buffer =" +sb);
        System.out.println("length =" +sb.length());
        System.out.println("capacity =" +sb.capacity());
        sb.setLength(2); //display only 2 character,Remaining contain null.
        System.out.println("buffer=" +sb);
        System.out.println("capacity =" +sb.capacity());
        System.out.println( sb.charAt(1));
        //System.out.println( sb.charAt(11));
        sb.setCharAt(1,'R');
        System.out.println("BUFFER" +sb);
    }
}
