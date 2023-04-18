package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); // equals는 대소문자 구별하기 때문에 false

        System.out.println(s2.equalsIgnoreCase("python")); //equalsIgnoreCase는 대소문자 구별안함 true

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true 리터럴이 같으므로
        System.out.println(s1 == s2); // true 참조하고 있는 객체가 같음 (리터럴대입으로 선언 되었으므로)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true 리터럴이 같으므로
        System.out.println(s1 == s2); // false 참조하고 있는 객체가 다름 (객체대입으로 선언 되었으므로)
    }
}
