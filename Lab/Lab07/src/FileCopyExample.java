/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-30
/// Lab07-4 : 파일 복사 프로그램

import java.io.*;
import java.nio.file.*;

// FileCopyExample 클래스 생성
public class FileCopyExample {
    public static void main(String[] args) {
        // 입력 파일(data.txt)과 출력 파일(output.txt) 이름 지정
        String inputFile = "data.txt";
        String outputFile = "output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile)); // 입력 파일 읽기
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile)) // 출력 파일 쓰기
        ) {
            String line; // 한 줄씩 읽은 내용을 저장할 변수

            int lineNumber = 1; // 현재 줄 번호를 저장할 변수

            // 반복문을 사용하여 파일의 끝에 도달할 때까지 한 줄씩 읽기
            while ((line = br.readLine()) != null) {
                // 출력 파일에 "줄번호: 내용" 형식으로 작성
                bw.write(lineNumber + ": " + line);
                bw.newLine(); // 줄 바꿈 추가
                lineNumber++; // 줄 번호 1 증가
            }
            // 모든 줄 복사가 완료되면 메시지 출력
            System.out.println("라인 번호가 포함된 파일이 output.txt에 저장되었습니다.");
        // 입력 파일이 존재하지 않을 때 예외 처리
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        // 파일 읽는 도중 오류가 발생했을 때 예외 처리
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }
}
