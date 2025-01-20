public class Circle {
    double radius;
    double area;
    double circumference;

    // constructor
    Circle(double radius) {
        this.radius = radius;
    }

    public void calculate() {
        double area = Math.PI * Math.pow(radius, 2);
        double circumferenece = 2 * Math.PI * radius;
        this.area = area;
        this.circumference = circumference;
    }

    public void display() {
        System.out.println("Area of circle : " + area);
        System.out.println("Circumferenece of the circle : " + circumference);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(4);

        c1.calculate();
        c1.display();
    }
}
