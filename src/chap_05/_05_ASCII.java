package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드

        char a = 'A'; // 알파벳 대문자(A) 65~ , 소문자(a) 97~, 숫자(0) 48~
        System.out.println(a);
        System.out.println((int)a);

        a = 'B';
        System.out.println(a);
        System.out.println((int)a);

        a++;
        System.out.println(a);
        System.out.println((int)a);

        System.out.println("------------------------");

        String[][] seats3 = new String[10][15];
        char eng = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(eng) + ( j + 1 );
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
            eng++;
        }
    }
}
