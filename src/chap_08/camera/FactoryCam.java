package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detectable) {
        this.detector = detectable;
    }
    public void setReporter(Reportable reportable) {
        this.reporter = reportable;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }
    @Override
    public void report() {
        reporter.report();
    }
}
