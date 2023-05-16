package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(1);

        //익명 객체를 인자로 넘겨주면서 메서드를 호출함 이때 람다식 사용, 이때 인터페이스에 추상메서드 2개이상이면 오류발생
//        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 1);

        // 위의 코드를 풀어쓴것
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 1);
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
