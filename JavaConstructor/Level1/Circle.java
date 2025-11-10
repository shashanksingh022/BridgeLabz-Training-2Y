/*Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
 */

 class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + getArea());
        System.out.println("Circumference : " + getCircumference());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        c1.display();
        c2.display();
    }
}
