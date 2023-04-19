package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        /*
            캡슐화 (Encapsulation) : 서로연관 되어있는것 들끼리 캡슐에 담는다

            정보은닉 (Information hiding) : 객체 내의 변수나 메소드의 직접적인 접근을 막고 객체에서 혀용해주는
            메소드를 통해서만 접근이 가능하게 하는것
         */

        // 접근 제어자
        // private   : 해당 클래스 내에서만 접근 가능
        // public    : 모든 클래스에서 접근 가능
        // default   : (미기입 시) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지일시 접근가능, 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
//        b1.resolution = "FHD";
        b1.setPrice(200_000);
        b1.color = "black";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("------------------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("white");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());

    }
}
