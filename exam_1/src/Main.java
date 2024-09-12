//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        // 잔돈 종류(Quarter 25, Dime 10, Nickel 5, Penny 1)
//        // 동전 이름대로 변수 선언 후 초기화
//        int Quarter, Dime, Nickel, Penny;
//        Quarter = 25;
//        Dime = 10;
//        Nickel = 5;
//        Penny = 1;
//
//        // 각 잔돈 합계 변수 선언
//        int Quarter_sum, Dime_sum, Nickel_sum, Penny_sum;
//        Quarter_sum = 0;
//        Dime_sum = 0;
//        Nickel_sum = 0;
//        Penny_sum = 0;
//
//        // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("테스트 케이스 반복 횟수 : ");
//        int T = sc.nextInt();
//
//        int C_1 = 0;
//        int C_2 = 0;
//        int C_3 = 0;
//
//        // 입력된 T값의 수량 만큼 반복
//        for (int i = 0; i < T; i++) {
//
//            // 잔액 입력(max 500) <-- 잔돈 입력 받기(단위 센트)
//            System.out.print("잔액 입력(1-500) : ");
//            int C = sc.nextInt();
//
//            if (C >= 25) { // 만약 잔액이 25보다 크거나 같으면,
//                System.out.println("\nC(입력된 잔액) : " + C);
//                Quarter_sum = C / Quarter; // 잔액을 Quarter로 나눈 결과를 Quarter_sum에 초기화하고,
//                System.out.println("Quarter_sum : " + Quarter_sum);
//                C_1 = C % Quarter; // Quarter_sum의 나머지를 C_1에 초기화한다.
//                System.out.println("Quarter 나머지 : " + C_1);
//            }
//
//            if (C_1 >= 10) { // 만약 잔액이 10보다 크거나 같으면,
//                System.out.println("\n인계 받은 잔액 : " + C_1);
//                Dime_sum = C_1 / Dime; // 잔액을 Dime로 나눈 결과를 Dime_sum에 초기화하고,
//                System.out.println("Dime_sum : " + Dime_sum);
//                C_2 = C_1 % Dime;// Dime_sum의 나머지를 C_2에 초기화한다.
//                System.out.println("Dime 나머지 : " + C_2);
//            }
//
//            if (C_2 >= 4) { // 만약 잔액이 5보다 크거나 같으면,
//                System.out.println("\n인계 받은 잔액 : " + C_2);
//                Nickel_sum = C_2 / Nickel; // 잔액을 Nickel로 나눈 결과를 Nickel_sum에 초기화하고,
//                System.out.println("Nickel_sum : " + Nickel_sum);
//                C_3 = C_2 % Nickel; // Nickel_sum의 나머지를 C_3에 초기화한다.
//                System.out.println("Nickel 나머지 : " + C_3);
//            }
//
//            if (C_3 != 0) { // 만약 C_3이 0이 아니면,
//                System.out.println("\n인계 받은 잔액 : " + C_3);
//                Penny_sum = C_3 / Penny; // C_3을 Penny로 나눈 값을 Penny_sum에 초기화
//                System.out.println("Penny_sum : " + Penny_sum);
//            }
//
//            System.out.println("\n\n" + Quarter_sum + " " + Dime_sum + " " + Nickel_sum + " " + Penny_sum);
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 메서드 선언

        int T = sc.nextInt(); // 테스트 케이스 횟수(T)를 입력 받음

        for (int i = 0; i < T; i++) { // 변수 i를 선언하고, 반복문 반복할 때마다 변수 i를 증가시켜 조건식이 성립될 경우 종료한다.
            int C = sc.nextInt(); // 잔액 입력 받음

            int quarter = C / 25; // Quarter를 선언하고, 잔액을 25로 나눈 값으로 초기화함
            C %= 25; // 잔액에 25로 나눈 나머지를 초기화함

            int dime = C / 10; // Dime를 선언하고, 잔액을 10로 나눈 값으로 초기화함
            C %= 10; // 잔액에 10으로 나눈 나머지를 초기화함

            int nickel = C / 5; // Nickel를 선언하고, 잔액을 5로 나눈 값으로 초기화함
            C %= 5; // 잔액에 5로 나눈 나머지를 초기화함

            int penny = C; // Penny를 선언하고, 잔액으로 초기화함

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny); // 각 동전이 공백을 두고 수량을 출력
        }

        sc.close(); // 스캐너 닫기
    }
}