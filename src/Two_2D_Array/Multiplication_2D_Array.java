package Two_2D_Array;

import java.util.Scanner;

public class Multiplication_2D_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[][] m1 = new int[A][B];
        int[][] m2 = new int[B][C];

        int[][] ans = new int[A][C];

        for(int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < A; i++) {
            for (int j = 0; j < C; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        // To calculate the sum of the index
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < C; j++) {
                int cur = 0;
                for (int k = 0; k < B; k++)
                    cur += m1[i][k]*m2[k][j];

                ans[i][j] = cur;
            }
        }

        for(int i = 0; i < A; i++) {
            for (int j = 0; j < C; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
