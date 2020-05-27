public class test {
  public static void main(String[] args){
    int num = 2;
    int num2 = 4;
    int num3 = 5;
    if(num > 0){
      if(num2 >3){
        System.out.println("nested if");
      } else if(num3 > 4){
        System.out.println("last if");
      }
      System.exit(0);
    }
    System.out.println("did not end");
  }
}
