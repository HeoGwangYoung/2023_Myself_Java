package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
//        BlackBox b1 = new BlackBox();
//        b1.callServiceCenter();
//
//        BlackBox b2 = new BlackBox();
//        b2.callServiceCenter();

        BlackBox.callServiceCenter();

        String s = String.valueOf(3); // ctrl + a로 확인해보면 오버로딩 되어있고, 스태틱으로 정의되어있는것을 볼 수 있음
    }
}
