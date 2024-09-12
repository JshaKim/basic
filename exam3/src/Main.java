import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 메서드 선언
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 횟수(T)를 입력 받음
        System.out.print("Test case 입력 : ");
        int T = sc.nextInt();

        // 변수 i를 선언하고, 반복문 반복할 때마다 변수 i를 증가시켜 조건식이 성립될 경우 종료한다.
        for (int i = 0; i < T; i++) {
            System.out.print("잔액을 입력하세요(1-500) : ");
            int C = sc.nextInt();  // 잔액 입력 받음

            int Quarter = C / 25; // Quarter를 선언하고, 잔액을 25로 나눈 값으로 초기화함
            C %= 25; // 잔액에 25로 나눈 나머지를 초기화함

            int Dime = C / 10; // Dime를 선언하고, 잔액을 10로 나눈 값으로 초기화함
            C %= 10;// 잔액에 10으로 나눈 나머지를 초기화함

            int Nickel = C / 5;// Nickel를 선언하고, 잔액을 5로 나눈 값으로 초기화함
            C %= 5;// 잔액에 5로 나눈 나머지를 초기화함

            int Penny = C;// Penny를 선언하고, 잔액으로 초기화함

            System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);// 각 동전이 공백을 두고 수량을 출력
        }
        sc.close(); // 스캐너 닫기.
    }
}