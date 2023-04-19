package chap_08;

// import chap_07.A; default 접근제어자 때문에 접근할 수 없음
import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";       // public
//        b1.resolution = "FHD";      // default
//        b1.price = 200_000;         // private
//        b1.color = "블랙";           // protected

//        A a = new A();    //접근 불가 (접근제어자 - default)
    }
}
