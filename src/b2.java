import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int count = 0;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the " + (i+1) + " element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter X");
        int x = sc.nextInt();
        for(int i = 0; i< n; i++){
            if(arr[i]<=x)count++;
        }
        System.out.println(count);
    }
}
