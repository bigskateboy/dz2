/**
        * @class Rectangle
 * @brief Класс для работы с прямоугольниками
        */
public class Rectangle {
    private double width;
    private double height;

    /**
            * @brief Конструктор класса Rectangle
     * @param width Ширина прямоугольника
     * @param height Высота прямоугольника
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
            * @brief Метод для вычисления площади прямоугольника
     * @return Площадь прямоугольника
     */
    public double calculateArea() {
        return width * height;
    }
}

