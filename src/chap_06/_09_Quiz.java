package chap_06;

public class _09_Quiz {
    public static String getHiddenData(String data, int index) {
        int firstNum = data.length();
        data = data.substring(0,index);
        int secondNum = data.length();
        int replaceNum = firstNum - secondNum;

        StringBuffer strbuffer = new StringBuffer(data);

        for (int i = 0; i < replaceNum; i++) {
            strbuffer.append("*");
        }

        data = strbuffer.toString();

        return data;
    }

    public static String getHiddenData_Nado(String data, int index) {
        String hiddenData = data.substring(0, index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        // 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오
        // 개인정보를 비공개로 전환하는 메소드 작성
        // 하나의 메소드에서 모든 동작처리
        String name = "나코딩";
        String id = "990130-1234567";
        String phoneNumber = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name,1));    // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id,8));
        System.out.println("전화번호 : " + getHiddenData(phoneNumber,9));
    }
}
