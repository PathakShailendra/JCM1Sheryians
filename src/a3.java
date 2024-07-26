import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<num; i++){
            if(num % i == 0){
                sum+=i;
            }
        }
        if(sum > num) System.out.println("Yes, it's an Abundant Number");
        else System.out.println("No, it's not a Abundant Number");
    }
}
