/**
        * @file Main.java
        * @brief Основной класс для работы с геометрическими фигурами
        */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
