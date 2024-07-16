package implementation;

import java.util.Scanner;


public class HelloWorld {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            
            // n * n 크기 배열 선언 ( 지도 )
            int[][] map = new int[n][n];
            
            // 지도 정보 입력 받기
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            
            // 최대값 저장
            int maxDistance = 0;
            
            // 사방탐색을 통해 각 섬의 최대 거리 계산
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    
                    // 지금 위치가 섬인지 검사
                    if (map[i][j] == 1) {
                        
                        // 동쪽으로의 최대 거리 계산
                        for (int d = 1; j + d < n; d++) {
                            if (map[i][j + d] == 1) {
                                maxDistance = Math.max(maxDistance, d);
                                break;
                            }
                        }
                        
                        // 서쪽으로의 최대 거리 계산
                        for (int d = 1; j - d >= 0; d++) {
                            if (map[i][j - d] == 1) {
                                maxDistance = Math.max(maxDistance, d);
                                break;
                            }
                        }
                        
                        // 북쪽으로의 최대 거리 계산
                        for (int d = 1; i - d >= 0; d++) {
                            if (map[i - d][j] == 1) {
                                maxDistance = Math.max(maxDistance, d);
                                break;
                            }
                        }
                        
                        // 남쪽으로의 최대 거리 계산
                        for (int d = 1; i + d < n; d++) {
                            if (map[i + d][j] == 1) {
                                maxDistance = Math.max(maxDistance, d);
                                break;
                            }
                        }
                    }
                }
            }
            
            System.out.println(maxDistance);

    }
}