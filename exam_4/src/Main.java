import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String potato = "감자";
        String corn = "옥수수";
        String waterMelon = "수박";

        Scanner sc = new Scanner(System.in);

        System.out.println("다음 세 가지 중 고르세요."); // 구입 품목 선택
        System.out.println("1. " + potato + " 2. " + corn + " 3. " + waterMelon); // 항목
        int input = sc.nextInt(); // 항목 입력

        int cost1 = 1000; // 감자 단가
        int cost2 = 4000; // 옥수수 단가
        int cost3 = 10000; // 수박 단가

        // 선택된 채소 메세지 노출
        if (input == 1) { // 만약 선택이 1번이면
            System.out.println(potato + "를 선택하셨습니다.");
            System.out.println("몇 개를 주문하시겠습니까?");
            System.out.println("1. " + cost1 + "원어치  2. " + (cost1 * 2) + "원어치  3. " + (cost1 * 3) + "원어치");
            int cost_potato = sc.nextInt();
        }
        if (input == 2) { // 만약 선택이 2번이면
            System.out.println(corn + "을 선택하셨습니다.");
            System.out.println("몇 개를 주문하시겠습니까?");
            System.out.println("1. " + cost2 + "원어치  2. " + (cost2 + 1000) + "원어치  3. " + (cost2 + 2000) + "원어치");
            int cost_corn = sc.nextInt();
        }
        if (input == 3) { // 만약 선택이 3번이면
            System.out.println(waterMelon + "을 선택하셨습니다.");
            System.out.println("몇 개를 주문하시겠습니까?");
            System.out.println("1. " + cost3 + "원어치  2. " + (cost3 * 2) + "원어치  3. " + (cost3 * 3) + "원어치");
            int cost_waterMelon = sc.nextInt();
        }

    }
}

