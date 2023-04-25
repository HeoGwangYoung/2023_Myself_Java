package chap_08.camera;

public class SpeedCam extends Camera{
    @Override
    public void showMainFeature() {
        System.out.println("속도측정, 번호인식");
    }

    public void detect() { //코드가 중복 되고있음
        System.out.println("사고를 감지합니다");
    }

    public void report() {
        System.out.println("사고 신고를 진행합니다");
    }
}
