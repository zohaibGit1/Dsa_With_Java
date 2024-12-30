package Two_2D_Array;

import java.util.Scanner;

public class InterChange_Main_Secondary_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] ar = new int[N][N];

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                ar[i][j] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            int temp = ar[i][i];
            ar[i][i] = ar[i][N - 1 - i];
            ar[i][N - 1 - i] = temp;
        }


        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//        4
//        5 6 1 10
//        9 20 15 5
//        2 1 3 7
//        8 11 8 9
