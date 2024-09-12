import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        [설탕봉지 3kg과 5kg 봉투를 변수 설정 후 초기화]
          int pack_3 = 0; // 자료형 변수 pack_3을 선언하고 0으로 초기화
          int pack_5 = 0; // 자료형 변수 pack_5를 선언하고 0로 초기화
//
//        [배달해야 할 설탕 무게 입력 받기]
          Scanner sc = new Scanner(System.in); // 입력 메서드 호출
          System.out.print("배달할 설탕 무게를 입력하세요. : "); // 메세지 출력(배달할 설탕 무게를 입력하세요. : )
          int n = sc.nextInt(); // 자료형 변수 n(설탕 무게)을 선언하고 스캔으로 정수를 입력 받음.
//
//        [배달할 설탕 봉지 양을 최소화하기]
          for (int i = 1; i <= n; i++) { // 반복문(자료형 변수 i 선언하고 1로 초기화; 변수 i가 설탕무게(n)보다 작거나 같을 때; 변수 i는 1씩 증가함)
              if (n > 5) { // 조건문(n이 5보다 클 경우)
                  pack_5 = n / 5; // pack_5 변수에 n을 5로 나눈 값을 초기화 함.
                  n %= n % 5;// 변수 n에 n을 5로 나눈 나머지 값을 초기화 함.
              } else if (n > 3) { // 다른 조건으로(n이 보다 3보다 클 경우)
                  pack_3 = n / 3; // pack_3 변수에 n을 3으로 나눈 값을 초기화 함.
                  n %= n % 3; // 변수 n에 n을 3으로 나눈 나머지 값을 초기화 함.
              } else if (n != 0) { // 다른 조건으로(n이 0이 아닌 경우)
                  System.out.println(-1); // -1을 화면에 출력
              }
              // [화면 출력]
              System.out.println(pack_5 + pack_3); // pack_5 + pack_3
          }
    }
}