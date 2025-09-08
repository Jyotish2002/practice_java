public class test{
    public static void main(String[] args){
        int a=1;
        byte b=1;
        short c=1;
        long d=1;

        System.out.print(a+b);
        System.out.println(((Object)a).getClass().getSimpleName()); //get type of varible ---> "integer"
        System.out.println("Minimum value of a is : "+ Short.MIN_VALUE); // get range of minimum value of short
    }
}