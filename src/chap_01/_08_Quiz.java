package chap_01;

public class _08_Quiz {
    public static void main(String[] args) {
        // 퀴즈1) 버스 도착 정보를 출력하는 프로그램을 작성하시오 각 정보는 적절한 자료형의 변수에 정의합니다.
        // 버스 번호는 "1234", "상암08"과 같은 형태
        // 남은 시간은 분 단위 (예: 3분, 5분)
        // 남은 거리는 km단위 (예: 1.5km, 0.8km)

        // 버스 번호
        String BusName = "상암08";

        // 남은 시간
        int min = 3;

        // 남은 거리
        double distance = 1.2;

        // 결과 출력
        System.out.println(BusName + "번 버스");
        System.out.println("약 " + min + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
