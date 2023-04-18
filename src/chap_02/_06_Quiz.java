package chap_02;

public class _06_Quiz {
    public static void main(String[] args) {
        //어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
        //키가 120cm 이상인 경우에만 탑승 가능
        //삼항 연산자 이용

        int heightLimit = 120;
        //키가 115인 경우
        int bodyHeight = 115;
        String check = (bodyHeight >= heightLimit) ? "탑승가능합니다." : "탑승불가능합니다.";
        System.out.println("키가 "+ bodyHeight + "cm 이므로 " +check);

        //키가 121인 경우
        bodyHeight = 121;
        check = (bodyHeight >= heightLimit) ? "탑승가능합니다." : "탑승불가능합니다.";
        System.out.println("키가 "+ bodyHeight + "cm 이므로 " +check);
    }
}
