/**
        * @class Triangle
 * @brief Класс для работы с треугольниками
        */
public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    /**
            * @brief Конструктор класса Triangle
     * @param side1 Первая сторона треугольника
     * @param side2 Вторая сторона треугольника
     * @param side3 Третья сторона треугольника
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
            * @brief Метод для вычисления площади треугольника
     * @return Площадь треугольника
     */
    public double calculateArea() {
        // Используем формулу Герона для вычисления площади треугольника
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
