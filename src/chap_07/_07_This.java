package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이"; // 까망이(최신형)
        b1.appendModelName("(최신형)"); // 코드보기 ctrl + shift + i 코드로 이동 ctrl + 클릭
        System.out.println(b1.modelName);
    }
}
