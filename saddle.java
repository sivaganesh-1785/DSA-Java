import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            int minCol = 0;
            for (int j = 1; j < 3; j++) {
                if (a[i][j] < a[i][minCol]) {
                    minCol = j;
                }
            }
            int saddle = a[i][minCol];
            boolean isSaddle = true;
            for (int k = 0; k < 3; k++) {
                if (a[k][minCol] > saddle) {
                    isSaddle = false;
                    break;
                }
            }
            if (isSaddle) {
                System.out.println("Saddle Point: " + saddle);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Saddle Point Found");
        }
        sc.close();
    }
}