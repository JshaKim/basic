//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 물건의 무게(W), 해당 물건의 가치(V) 변수 선언 / 초기화
//        int w, v;
//        // [첫 입력 : 물품의 수(N), 버틸 수 있는 무게(K)]
//        System.out.print("배낭에 담을 물품 수량을 입력하세요. : ");
//        int n = sc.nextInt();
//        System.out.print("배낭에 담을 수 있는 최대 중량을 입력하세요 : ");
//        int k = sc.nextInt();
//
//        //
//        int [][] nwv = new int [n][k];
//
//
//        for (int i = 1; i <= n; i++) { // 물품 수량(N)이 물건의 무게와 가치를 입력 받는 횟수
//
//            // [N번째 입력 : 물건의 무게(W), 해당 물건의 가치(V)]
//            System.out.print("\n물건의 무게 : ");
//            w = sc.nextInt();
//            System.out.print("물건의 가치 : ");
//            v = sc.nextInt();
//
//            System.out.println(w + " " + v);
//
//            // k
//            if (k >= w) {
//
//            }
//        }
//    }
//}
//
///*
//
//** 입력은 자료형 변수
//[첫 입력 : 물품의 수(N), 버틸 수 있는 무게(K)]
//[N번째 입력 : 물건의 무게(W), 해당 물건의 가치(V)]
//
//한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.
//
//
//[문제 해석]
//여행에 필요하다고 생각하는 물건(N개)
//각 물건의 무게 W와 가치 V(무게 = W 가치 = V)
//준서가 배낭에 가져갈 수 있는 최대 무게(K = N x W)
//
//배낭에 넣을 수 있는 물건들의 가치들의 합의 최대값
//
//
//** Scanner 매서드 호출
//** [물품 수량 / 배낭 적재 가능무게 입력]
//** 문자 출력(배낭에 담을 물품 수량을 입력하세요)
//** 물품 수량(N) 변수 선언, nextInt로 초기화
//** 문자 출력(배낭에 담을 수 있는 최대 중량을 입력하세요)
//** 배낭에 담길 수 있는 최대 무게(K) 변수 선언, nextInt로 초기화
//**
//** 각 물건의 무게(W)와 물건의 가치(V)를 n회 반복으로 입력 받음
//** 물품 수량(N)이 물건의 무게와 가치를 입력 받는 횟수
//** 배낭에 넣을 수 있는 물건의 조건은 최대 무게(K)를 넘지 않아야 함
//** 위 조건을 충족하는 물건들의 가치 합을 출력하라.
//
//* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: 물품의 수(N), 배낭의 최대 무게(K)
        System.out.print("배낭에 담을 물품 수량을 입력하세요. : ");
        int n = sc.nextInt();
        System.out.print("배낭에 담을 수 있는 최대 중량을 입력하세요 : ");
        int k = sc.nextInt();

        // 각 물건의 무게와 가치를 저장할 배열
        int[] w = new int[n+1]; // 물건의 무게 배열
        int[] v = new int[n+1]; // 물건의 가치 배열

        // 물건들의 무게와 가치를 입력받음
        for (int i = 1; i <= n; i++) { // n번 만큼 물건의 무게와 가치를 입력 받음
            System.out.print("\n물건 " + i + "의 무게 : ");
            w[i] = sc.nextInt(); // 입력 받은 정수형 데이터를 w 변수의 i번째 배열에 초기화함.
            System.out.print("물건 " + i + "의 가치 : ");
            v[i] = sc.nextInt(); // 입력 받은 정수형 데이터를 v 변수의 i번째 배열에 초기화함.
        }

        // DP 테이블 초기화
        int[][] dp = new int[n+1][k+1]; // 정수형 배열 dp 변수를 선언하고, 새로운 자료형 배열 n, k를 1번을 시작으로 만들겠음.

        // 동적 계획법으로 최대 가치 계산
        for (int i = 1; i <= n; i++) { // i: 물건 인덱스(--기호 해석 : 변수 i를 선언, 1로 초기화함; i가 n보다 작거나 같으면 반복문이 다시 실행하고, 반복될 때마다 i에 1씩 더하여 조건을 벗어나면 반복을 멈춘다.)
            for (int j = 1; j <= k; j++) { // j: 현재 배낭의 무게 한도(--기호 해석 : 변수 j를 선언, 1로 초기화함; j가 k보다 작거나 같으면 반복문이 다시 실행하고, 반복될 때마다 i에 1씩 더하여 조건을 벗어나면 반복을 멈춘다.)
                if (w[i] <= j) { // 
                    // 물건을 넣는 경우와 넣지 않는 경우 중 더 큰 값을 선택
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - w[i]] + v[i]);
                } else {
                    // 물건을 넣을 수 없는 경우
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        // 배낭에 넣을 수 있는 물건들의 최대 가치 출력
        System.out.println("배낭에 넣을 수 있는 최대 가치: " + dp[n][k]);
    }
}