/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-09
/// Lab05-1 : 인터페이스 실습

// Shape 인터페이스 생성
public interface Shape {
    final double PI = 3.14; // 원주율 PI 정의

    // 도형 그리기 추상 메소드 생성
    void draw();
    // 도형 면적 계산 추상 메소드 생성
    double getArea();

    // 디폴트 메소드 생성
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
