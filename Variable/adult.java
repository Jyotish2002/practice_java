public class adult {
    public static void main(String[] args) {
        boolean isAdult = false;
       if(isAdult){
        System.out.print("You can vote");
       }
       else{
        System.out.println("You can't vote");
       }
    char a ='n';
    System.out.println(a);
    // How to convert char to int
    System.out.println((int) a);
    
    // String Creating
    String s1= "Hello how are you?"; //Literal
    String s2=new String("Hello how are you?"); //Constructor
    System.out.println(s1.equals(s2));

   

    //Creating object
   adult person1 = new adult();

    }
}
