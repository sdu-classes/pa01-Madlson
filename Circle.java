public class Circle{
    private double radius = 1.0;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2.0);
    }
    public double getCicumference(){
        return Math.PI*radius*2;
    }
    @Override
    public String toString(){
        return "Circle radius = " + radius +
                "\nArea = " + getArea() +
                "\nCircumference = " + getCicumference();

    }

}