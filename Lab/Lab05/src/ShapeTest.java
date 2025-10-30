/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-09
/// Lab05-1 : 인터페이스 실습

// Circle 클래스 생성 - Shape 인터페이스 구현
class Circle implements Shape {
    // Circle 필드 생성
    int radius;

    // Circle 생성자 생성
    public Circle(int radius) {
        this.radius = radius;
    }

    // Shape 인터페이스의 draw() 메소드를 오버라이딩
    @Override
    public void draw() {
        System.out.println("[원] 반지름: " + radius);
    }

    // Shape 인터페이스의 getArea() 메소드를 오버라이딩
    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}

// Oval 클래스 생성 - Shape 인터페이스 구현
class Oval implements Shape {
    // Oval 필드 생성
    int width, height;

    // Oval 생성자 생성
    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Shape 인터페이스의 draw() 메소드를 오버라이딩
    @Override
    public void draw() {
        System.out.println("[타원] 너비: " + width + ", 높이: " + height + "에 내접하는 타원");
    }

    // Shape 인터페이스의 getArea() 메소드를 오버라이딩
    @Override
    public double getArea() {
        return PI * width * height / 4.0;
    }
}

// Rectangle 클래스 생성 - Shape 인터페이스 구현
class Rectangle implements Shape {
    // Rectangle 필드 생성
    int width, height;

    // Rectangle 생성자 생성
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Shape 인터페이스의 draw() 메소드를 오버라이딩
    @Override
    public void draw() {
       System.out.println("[사각형] 너비: " + width + ", 높이: " + height);
    }

    // Shape 인터페이스의 getArea() 메소드를 오버라이딩
    @Override
    public double getArea() {
        return width * height;
    }
}

// ShapeTest 클래스 생성
public class ShapeTest {
    public static void main(String[] args) {
        // Shape 객체를 저장할 배열 생성
        Shape[] list = new Shape[3];

        list[0] = new Circle(10); // 반지름이 10인 원
        list[1] = new Oval(20, 30); // 20 x 30 사각형에 내접하는 타원
        list[2] = new Rectangle(10, 40); // 10 x 40 크기의 사각형

        // 배열에 저장된 도형 면적 정보를 반복문을 사용하여 출력
        for(Shape s: list) {
            s.redraw();
            System.out.printf("면적: %.2f \n", s.getArea());
        }
    }
}
