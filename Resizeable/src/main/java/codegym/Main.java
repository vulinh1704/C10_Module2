package codegym;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        Circle circle = new Circle(4);
        Circle circle02 = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Rectangle rectangle02 = new Rectangle(2, 5);
        shapes[0] = circle;
        shapes[1] = circle02;
        shapes[2] = rectangle;
        shapes[3] = rectangle02;

        for(Shape s: shapes) {
            System.out.println("Before Resize: ");
            System.out.println(s);
            double percent = Math.random() * 100 + 1; // 0 - 0.99 =>
            percent = Math.floor(percent);
            s.resize(percent);
            System.out.println("Resize Percent: " + percent);
            System.out.println("After Resize: ");
            System.out.println(s);
            System.out.println("=================");
        }
    }
}
