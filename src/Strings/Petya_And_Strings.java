package Strings;

import java.util.Scanner;

public class Petya_And_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int n = s1.length();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) < s2.charAt(i)){
                System.out.println(-1);
                return;
            }
            if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
