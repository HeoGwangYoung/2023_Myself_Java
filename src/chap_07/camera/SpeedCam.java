package chap_07.camera;

// SpeedCam is a Camera
public class SpeedCam extends Camera { // 자식 클래스
    public SpeedCam() {
        super("과속단속 카메라");
    }
    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }
    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다");
    }
    //@Override // 부모클래스에 오버라이딩될 메소드가 없으면 에러
    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량번호를 인식합니다");
    }
    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
