import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        int[][] m = new int[3][3];
        int[][] n = new int[3][3];
        int[][] o = new int[3][3];

        System.out.println("Enter First Matrix Elements:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix Elements:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                n[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                o[i][j] = m[i][j] + n[i][j];
            }
        }

        System.out.println("Sum of Matrices:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(o[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}