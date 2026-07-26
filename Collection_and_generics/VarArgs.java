package Collection_and_generics;

public class VarArgs {
  public static void main(String[] args){
      System.out.println(sum(4, 5));
      System.out.println(sum(4,5,6));
      System.out.println(sum(4,5,6,7,4,5));
    }
    public static int sum(int...a){
     int sum = 0;
     for (int i : a){
         sum += i;
    }
     return sum;
    //public static int sum(int[] a){
      //int sum = 0;
      //for(int i : a){
        //  sum += 1;
      //}
      //return sum;
    }
}
