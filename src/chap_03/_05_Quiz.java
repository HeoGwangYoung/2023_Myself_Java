package chap_03;

public class _05_Quiz {
    public static void main(String[] args) {
        //주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오

        //주민등록번호는 13자리의 숫자로 구성
        //앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별정보
        //입력 데이터는 -을 포함한 14자리의 문자열 형태

        //예시)
        //901231-1234567 인 경우 901231-1까지 출력
        //030708-4567890 인 경우 030708-4까지 출력

        String per01_ID = "901231-1234567";
        String per02_ID = "030708-4567890";

        int per01_ID_sex_Index = per01_ID.indexOf("-")+2;
        int per02_ID_sex_Index = per02_ID.indexOf("-")+2;

        System.out.println(per01_ID.substring(0,per01_ID_sex_Index));
        System.out.println(per02_ID.substring(0,per02_ID_sex_Index));
    }
}
