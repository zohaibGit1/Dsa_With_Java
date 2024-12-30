package Two_2D_Array;

import java.util.Scanner;

public class Print_Main_Diagonal_2D_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] ar = new int[N][N];

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
/*
        First Approach
        for (int i = 0; i < N; i++) {
            System.out.print(ar[i][i] + " ");
        }*/

//         Second Approach
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print(ar[i][j] + " ");
            }
        }
    }
}
