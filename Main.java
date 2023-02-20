public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c1 area: " + c1.getArea());
        System.out.println("c1 circumference: " + c1.getCircumference());
        System.out.println("c1 toString: " + c1.toString());

        Circle c2 = new Circle(2.5);
        System.out.println("c2 radius: " + c2.getRadius());
        System.out.println("c2 area: " + c2.getArea());
        System.out.println("c2 circumference: " + c2.getCircumference());
        System.out.println("c2 toString: " + c2.toString());

        c2.setRadius(3.0);
        System.out.println("c2 radius (after setRadius): " + c2.getRadius());
        System.out.println("c2 area (after setRadius): " + c2.getArea());
        System.out.println("c2 circumference (after setRadius): " + c2.getCircumference());
        System.out.println("c2 toString (after setRadius): " + c2.toString());
    }
}
