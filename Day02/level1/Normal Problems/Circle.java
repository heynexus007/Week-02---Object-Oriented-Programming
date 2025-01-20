public class Circle {
    double radius;
    double area;
    //Default constructor
    Circle(){
        this(2.0);
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    //Method that calculate area
    public void getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        this.area=area;
        System.out.println("Area of circle : " + area);
    }

    public static void main(String[] args) {
        // Creating object for constructor
        Circle defConst = new Circle(); 
        defConst.getArea();
        
    }
}

