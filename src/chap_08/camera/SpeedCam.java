package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    private Reportable reporter;
    private Detectable detector;
    @Override
    public void showMainFeature() {
        System.out.println("속도측정, 번호인식");
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void detect() {
        this.detector.detect();
    }

    public void report() {
        this.reporter.report();
    }
}
