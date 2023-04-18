package chap_04;

public class _12_Quiz {
    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.
        // 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        // 주차요금 예시
        // 1번 일반 차량 5시간 주차시 20000원
        // 2번 경차 5시간 주차시 10000원
        // 3번 장애인 차량 10시간 주차시 15000원

        int carType = 0; //0-일반차, 1-경차, 2-장애인차량
        int cost = 0;
        int hour = 0;


        System.out.println("--------1번 승용차--------");
        cost = 0;
        carType = 0;
        hour = 5;
        switch (carType){
            case 0: //일반
                for (int i = 0; i < hour; i++) {
                    cost += 4000; // 시간당 4000원
                    if (cost >= 30000){ //비용 30000원 초과시
                        cost = 30000;
                        break;
                    }
                }
                break;
            case 1: //경차
                for (int i = 0; i < hour; i++) {
                    cost += 4000; // 시간당 4000원
                    if (cost >= 30000){ //비용 30000원 초과시
                        cost = 30000;
                        break;
                    }
                }
                cost /= 2;
                break;
            default: //장애인
                for (int i = 0; i < hour; i++) {
                    cost += 4000; // 시간당 4000원
                    if (cost >= 30000){ //비용 30000원 초과시
                        cost = 30000;
                        break;
                    }
                }
                cost /= 2;
                break;
        }
        System.out.println("차량 종류는 " + carType +"번 입니다");
        System.out.println("총주차 시간은 " + hour + "시간 입니다.");
        System.out.println("정산 금액은 " + cost + "원 입니다.");


        System.out.println("--------2번 경차--------");
        cost = 0;
        carType = 1;
        hour = 5;
        switch (carType){
            case 0: //일반
                for (int i = 0; i < hour; i++) {
                    cost += 4000; // 시간당 4000원
                    if (cost >= 30000){ //비용 30000원 초과시
                        cost = 30000;
                        break;
                    }
                }
                break;
            case 1: //경차
                for (int i = 0; i < hour; i++) {
                    cost += 4000; // 시간당 4000원
                    if (cost >= 30000){ //비용 30000원 초과시
                        cost = 30000;
                        break;
                    }
                }
                cost /= 2;
                break;
            default: //장애인
                for (int i = 0; i < hour; i++) {
                    cost += 4000; // 시간당 4000원
                    if (cost >= 30000){ //비용 30000원 초과시
                        cost = 30000;
                        break;
                    }
                }
                cost /= 2;
                break;
        }
        System.out.println("차량 종류는 " + carType +"번 입니다");
        System.out.println("총주차 시간은 " + hour + "시간 입니다.");
        System.out.println("정산 금액은 " + cost + "원 입니다.");


        System.out.println("--------3번 장애인차량--------");
        cost = 0;
        carType = 2;
        hour = 10;
        switch (carType){
            case 0: //일반
                for (int i = 0; i < hour; i++) {
                    cost += 4000; // 시간당 4000원
                    if (cost >= 30000){ //비용 30000원 초과시
                        cost = 30000;
                        break;
                    }
                }
                break;
            case 1: //경차
                for (int i = 0; i < hour; i++) {
                    cost += 4000; // 시간당 4000원
                    if (cost >= 30000){ //비용 30000원 초과시
                        cost = 30000;
                        break;
                    }
                }
                cost /= 2;
                break;
            default: //장애인
                for (int i = 0; i < hour; i++) {
                    cost += 4000; // 시간당 4000원
                    if (cost >= 30000){ //비용 30000원 초과시
                        cost = 30000;
                        break;
                    }
                }
                cost /= 2;
                break;
        }
        System.out.println("차량 종류는 " + carType +"번 입니다");
        System.out.println("총주차 시간은 " + hour + "시간 입니다.");
        System.out.println("정산 금액은 " + cost + "원 입니다.");
    }
}
