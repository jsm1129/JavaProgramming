/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-30
/// Lab07-5 : 디렉터리에서 가장 큰 파일 찾기

import java.io.File;

// FindFilesExample 클래스 생성
public class FindFilesExample {
    public static void main(String[] args) {
        // 경로를 File 객체로 생성
        File dir = new File("C:\\");

        // 지정한 디렉터리 내의 파일을 배열로 가져옴
        File[] files = dir.listFiles();

        File largestFile = null; // 가장 클 파일을 저장할 변수
        long maxSize = 0; // 가장 큰 파일의 크기를 저장할 변수

        // 반복문을 사용하여 디렉터리 내의 모든 항목 순회
        for (File file : files) {
            // 하위 폴더 제외, 파일만 검사
            if (file.isFile()) {
                // 파일 크기
                long size = file.length();
                // 현재까지의 최대 크기보다 크면 갱신
                if (size > maxSize) {
                    maxSize = size; // 새로운 최대 크기 저장
                    largestFile = file; // 해당 파일을 가장 큰 파일로 저장
                }
            }
        }
        // 가장 큰 파일이 존재할 경우 정보 출력
        if (largestFile != null) {
            System.out.println("C:\\에서 가장 큰 파일은");
            System.out.println("이름: " + largestFile.getName());
            System.out.println("크기: " + maxSize + " bytes");
        // 파일이 없는 경우
        } else {
            System.out.println("C:\\ 경로에 파일이 존재하지 않습니다.");
        }
    }
}
