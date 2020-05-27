public class test1 {
    public static void main(String[] args){
        int[] day = {1,2,3,4,5,6,7,8};
        string();
    }
    private static int test2(){
        int num[] = new int[5];
        num[0] = 12;
        num[1] = 13;
        num[2] = 14;
        num[3] = 15;
        num[4] = 16;

        return num[1];
    }
    private static void string(){
        int[] num = {1,2,3,4};
        for(int str : num){
            System.out.print("The next number is ");
            System.out.println(str);
        }
    }
}
