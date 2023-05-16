package chap_10.converter;

@FunctionalInterface
public interface Convertible {
    void convert(int USD);
//    void convert2(); //annotation 을 붙이면 IDE 에서부터 에러가뜸
}
