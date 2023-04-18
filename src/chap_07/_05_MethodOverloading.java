package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(false, false, 10);
        System.out.println("=====================");
        b1.record(true, false, 3);
        System.out.println("=====================");
        b1.record(true, true, 5);
        System.out.println("=====================");
        b1.record();

        // String 클래스에서 메소드오버로딩
        String s = "BlackBox";
        System.out.println(s.indexOf("a")); // indexOf 에서 ctrl + a 누르면 indexOf가 정의된 부분으로 이동가능
        // 확인해보면 indexOf 메소드가 오버로딩되었는것을 볼 수있음

    }
}
