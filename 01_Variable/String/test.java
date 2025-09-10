public class test {
    public static void main(String[] args) {
        String name="Jyotish yadav";
        name=name.toUpperCase();
        System.out.println(name); // convert into capital create new string but still point to name 
        //Checking
        System.out.println(name.endsWith("YADAV")); //true

        //Replace
        String n2="Sumit Singh";
        n2=n2.replace("Singh","Shaw");
        System.out.println(n2);
    }
}
