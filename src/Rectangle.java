import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
//Tạo class chứa phương thức main để thực thi chương trình
class Ex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double inputWidth = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double inputHeight = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(inputWidth,inputHeight);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}



