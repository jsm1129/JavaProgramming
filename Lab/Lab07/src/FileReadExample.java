/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-30
/// Lab07-3 : 파일 읽기 예외 처리

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

// FileReadExample 클래스 생성
public class FileReadExample {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("읽을 파일 이름을 입력하세요: ");
        String fileName = sc.nextLine(); // 한줄 전체 입력받기

        // 입력 받은 파일 이름을 기반으로 Path 객체 생성
        Path path = Paths.get(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            // 파일이 정상적으로 열리면 내용 출력 시작
            System.out.println("===== 파일 내용 =====");

            // 한 줄씩 읽은 내용을 저장할 변수
            String line;

            // 파일의 끝에 도달할 때까지 한 줄씩 읽기
            while ((line = br.readLine()) != null) {
                System.out.println(line); // 한 줄 출력
            }
            System.out.println("===================");
        // 파일이 존재하지 않을 때 발생하는 예외 처리
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        // 파일을 읽는 중 오류가 발생할 때 예외 처리
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }
}
