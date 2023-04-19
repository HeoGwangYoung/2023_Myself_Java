package chap_07;

public class BlackBoxRefurbish {
    public String modelName; // 모델명
    String resolution; // 해상도
    private int price; // 가격
    protected String color; // 색상

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.max(price,100_000);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// public 클래스는 왼쪽 프로젝트 탐색기에서 한클래스에 하나만 존재가능, 이름 일치 해야함 그외는 상관 x
class A {   // default class => 같은 패키지 내에서만 접근가능

}