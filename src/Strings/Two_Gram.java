    package Strings;

    import java.util.Scanner;

    public class Two_Gram {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String s = sc.next();

            String finalAnswer = "";
            int maxFreq = 0;

            // To Store the frequency of elements
            for (int i = 0; i < n -1 ; i++) {
                int curFreq = 0;
                for (int j = 0; j < n -1; j++) {
                    if (s.charAt(i) ==s.charAt(j) && s.charAt( i + 1) == s.charAt(j + 1)){
                        curFreq++;
                    }
                }
                if (maxFreq > curFreq) {
                    maxFreq = curFreq;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(s.charAt(i));
                    stringBuilder.append(s.charAt(i + 1));
                    finalAnswer = stringBuilder.toString();
                }
                System.out.println(finalAnswer);
            }

        }
    }
