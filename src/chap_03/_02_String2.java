package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // "and"를 ","로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 기준 (이전 내용은 삭제)
        // 위와 같이하면 변수에는 적용안됨 s = s.substring(7); 이렇게해야 s 변수에 반영됨
        System.out.println(s.substring(s.indexOf("Java"))); //위 메서드와 기능 동일 s.indexOf("Java") == 7

        // 시작 위치("Java" 가 시작하는 위치) 부터 끝위치 "직전"("."이 시작하는 위치 바로 앞) 까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));


        // 공백 제거
        s = "       I love Java.    ";
        System.out.println(s);
        System.out.println(s.trim()); // 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
