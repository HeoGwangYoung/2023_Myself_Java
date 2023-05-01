package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트 (리스트와 달리 중복데이터를 허용하지 않음, 순서가 보장이 되지 않음)
        HashSet<String> set = new HashSet<>();

        // 데이터 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());

        // 순회
        for (String name : set) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("------------------------");

        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("------------------------");

        // 삭제
        System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size()); // 7
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size()); // 6

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("------------------------");

        // set : 중복 허용 x, 순서 보장 x
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (int i : intSet) {
            System.out.println(i);
        }

        HashSet<Integer> intSet2 = new LinkedHashSet<>(); //LinkedHashSet 은 중복을 허용하지않고 순서를 보장함
        intSet2.add(1);
        intSet2.add(13);
        intSet2.add(2);

        for (int i : intSet2) {
            System.out.println(i);
        }
    }
}
