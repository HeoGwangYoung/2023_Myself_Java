package chap_08.detector;

public interface Detectable {
    // String name = "감지자";    // interface 내부의 instance 는 앞에 자동으로 public static final 이 붙음
    void detect(); // 감지 interface 의 abstract method 는 자동으로 앞에 public abstract 키워드가 붙어있음

}
