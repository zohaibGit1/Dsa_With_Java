package Two_2D_Array;

import java.util.Scanner;

public class Spiral_Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] mat = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++)
                mat[i][j] = sc.nextInt();
        }

        int top = 0, left = 0, bot = R - 1, rig = C - 1;
        while (top <= bot && left <= rig) {
            for (int col = top; col <= bot; col++) {
                System.out.print(mat[top][col] + " ");
            }

            for (int row = top; row <= bot; row++) {
                System.out.print(mat[row][rig] + " ");
            }

            for (int col = bot; col > left; col--) {
                System.out.print(mat[bot][col] + " ");
            }

            for (int row = bot; row > top; row--) {
                System.out.print(mat[row][left] + " ");
            }
            top++; left++;
            bot--; rig--;
        }
    }
}
//
//5 6
//        1   2  3 4  5  6
//        18 19 20 21 22 7
//        17 28 29 30 23 8
//        16 27 26 25 24 9
//        15 14 13 12 11 10