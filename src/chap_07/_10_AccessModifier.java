package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 접근 제어자
        // private   : 해당 클래스 내에서만 접근 가능
        // public    : 모든 클래스에서 접근 가능
        // default   : (미기입 시) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지일시 접근가능, 다른 패키지인 경우 자식 클래스에서 접근 가능
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
//        b1.resolution = "FHD";
        b1.price = 200_000;
        b1.color = "black";

        // 할인 행사
        b1.price = -5000;
        System.out.println("가격 : " + b1.price + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("------------------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("white");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
        b2.price = -5000;
    }
}
