package chap_05;

public class _06_Quiz {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매가능한 신발사이즈 옵션을 출력하는 프로그램을 작성하시오.
        // 신발 사이즈는 250부터 295까지 5단위로 증가
        // 신발 사이즈 수는 총 10가지

        // 신발 사이즈 생성
        int shoes = 10;
        int[] shoesSize = new int[shoes];
        boolean[] isShoesSize = new boolean[shoes];
        int minSize = 250;

        for (int i = 0; i < shoesSize.length; i++) {
            shoesSize[i] = minSize + ( i * 5 );
            isShoesSize[i] = true;
        }

        // 재고 소진시 isShoeSize[index] = false 하면됨

        // 신발 사이즈 재고 확인
        for (int i = 0; i < isShoesSize.length; i++) {
            if(isShoesSize[i] == true) {
                System.out.println("사이즈 " + shoesSize[i] + " (재고 있음)");
            }
            else{
                System.out.println("사이즈 " + shoesSize[i] + " (재고 없음)");
            }
        }
    }
}
