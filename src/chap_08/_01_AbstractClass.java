package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    // 데이터 추상화 (Data Abstraction)
    // abstract
    // 추상 클래스 (아직 완성되지 않은 클래스)
    // 추상 메소드 (추상 클래스 또는 인터페이스 에서만 사용 가능한, 껍데기만 있는 메소드)

    public static void main(String[] args) {
        // Camera camera = new Camera(); // 불가능 Camera 클래스가 추상클래스임
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
