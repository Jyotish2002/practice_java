public class test06 {
    public static void main(String[] args) {
        // same type and fixed size---> use array
        // int[] numbers;// recommended
        int [] a= new int[8];//when only create array
        int [] number={14,12,18,14,20,63,47};
      
        // System.out.println(a);
        // for(int i=1;i<number.length;i++){
        //     System.out.println(number[i]);
        // }
        for(int p:number){
            System.out.println(p); //best and easy way
        }
    }
}
