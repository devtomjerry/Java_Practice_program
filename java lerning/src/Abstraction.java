abstract class Shape {
    abstract void draw();

    void description() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        circle.description();
        Shape rectangle = new Rectangle();
        rectangle.draw();
        rectangle.description();
    }
}
