package chapter_18;

public class SumForNumber {

    public static void main(String[] args) {
        int n = 25000;
        int sum = 0;
        while (true) {
            if (sum > 25000) {
                break;
            }else{
            
            sum+=n;
            }
            System.out.println(sum);
        }
    }
}