/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-11
/// Lab01-3 : 배열에서 최대/최소 찾기

public class ArrayMinMaxRandom {
    public static void main(String[] args) {
        // 필요한 변수 선언
        int[] arr = new int[10];

        // 배열 랜덤 초기화(1~100)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        // 최댓값과 최솟값 초기화
        int max = arr[0];
        int min = arr[0];

        // 배열 탐색/최댓값,최솟값 저장
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        // 배열 값 출력
        System.out.print("배열 값: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 결과 출력
        System.out.println("배열의 최댓값: " + max);
        System.out.println("배열의 최솟값: " + min);
    }
}
