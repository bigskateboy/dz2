/**
        * @class Circle
 * @brief Класс для работы с кругами
        */
public class Circle {
    private double radius;

    /**
            * @brief Конструктор класса Circle
     * @param radius Радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
            * @brief Метод для вычисления площади круга
     * @return Площадь круга
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

