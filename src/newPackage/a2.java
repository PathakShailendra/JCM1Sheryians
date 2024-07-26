package newPackage;

public class a2 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                if((i%2==0 && j==0) || (i%2!=0 && j==1) || (i%2==0 && j==2) || (i%2!=0 && j==3) || (i==j)) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
