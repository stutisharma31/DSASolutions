#Recursion
  public class Recursion {
  public static void Dec(int n){
      if(n==1){
          System.out.print(1);
          return;
      }
      System.out.print(n);
      Dec(n-1);
  }
  public static void Inc(int n){
      if(n==1){
          System.out.print(1);
          return;
      }
      Inc(n-1);
      System.out.print(n);
  }
  public static void main(String[] args) {
      Inc(5);
      System.out.println(" ");
      Dec(5);

  }
}

