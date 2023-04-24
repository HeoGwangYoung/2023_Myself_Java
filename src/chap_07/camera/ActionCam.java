package chap_07.camera;

public final class ActionCam extends Camera {
    public final String lens;

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() { // final 키워드를 추가함으로써 오버라이딩 불가
        System.out.println(this.name + " : " + lens + " 로 촬영한 영상을 통해 멋진 비디오를 제작합니다");
    }
}
