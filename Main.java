public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 10, 5, 2);
        System.out.println(ball);

        ball.move();
        System.out.println(ball);

        ball.reflectHorizontal();
        System.out.println(ball);

        ball.move();
        System.out.println(ball);

        ball.reflectVertical();
        System.out.println(ball);

        ball.move();
        System.out.println(ball);
    }
}
