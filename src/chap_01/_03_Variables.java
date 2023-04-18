package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "광영";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "비누";
        System.out.println(name + "님의 평균 점수는 " + score + " 점입니다.");
        System.out.println(name + "님의 학점은 " + grade + " 입니다.");

        boolean pass = true;
        System.out.println("이번시험의 합격결과? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; //float 변수에 literal을 집어넣을때는 f를 붙여야한다.
        System.out.println(d);
        System.out.println(f); //float은 double에 비해 사용메모리가 작아서 정밀도가 떨어짐.

        //int i = 1000000000000; 범위초과 컴파일에러 int형이 가질수 있는 범위는 약-21억~+21억
        long l = 1_000_000_000_000L; //범위가 더 큰 long형을 사용하면 됨 long형을 사용할때는 리터럴 뒤에 L을 붙여야함.
        System.out.println(l);

    }
}
