package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("박명수");
        list.add("노홍철");
        list.add("정준하");
        list.add("정형돈");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 추가
        list.addFirst("길");
        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        list.addLast("하하");
        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("----------------------");

        System.out.println("추가 전");
        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println();

        System.out.println("추가 후");
        list.add(1, "조세호");
        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("----------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());
        System.out.println("----------------------");

        // 처음 학생과 마지막 학생이 전학
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println();

        list.removeFirst();
        list.removeLast();

        System.out.println("남은 학생 수 (전학 후) : " + list.size());
        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("----------------------");

        // 변경 (수강권 양도)
        list.set(0, "이수근");
        System.out.println(list.get(0));

        // 확인
        System.out.println(list.indexOf("이수근"));
        if (list.contains("이수근")) {
            System.out.println("수강신청 성공");
        } else {
            System.out.println("수강신청 실패");
        }
        System.out.println("----------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생수 : " + list.size());
            System.out.println("리스트가 비었습니다");
        }
        System.out.println("----------------------");

        // 새로운 학기
        list.add("유재석");
        list.add("박명수");
        list.add("노홍철");
        list.add("정준하");
        list.add("정형돈");

        Collections.sort(list); // 정렬
        for (String name : list) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}