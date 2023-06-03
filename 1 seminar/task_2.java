public class Rectangle {
    private int width;
    private int height;
 
    public Rectangle() {
        super();
        this.height = 10;
        this.width = 25;
    }
 
    public Rectangle(int w, int h) {
        super();
        this.width = w;
        this.height = h;
 
    }
 
    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2*(width + height);
    }
 
    public int getWidth() {
        return width;
    }
 
    public int getHeight() {
        return height;
    }
 
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Создан прямоугольник по-умолчанию: ширина = 25, высота = 10");
        System.out.println("Это первый прямоугольник:");
        r1.draw();
 
        Rectangle r2 = new Rectangle(20, 7);
        if ((r2.getWidth() >= 0 && r2.getWidth() <= 30) && (r2.getHeight() >= 0 && r2.getHeight() <= 30)) {
            System.out.println("Создан прямоугольник: ширина = " + r2.getWidth() + " и высота = " + r2.getHeight());
            System.out.println("Это второй прямоугольник:");
            r2.draw();
            System.out.println("Площадь второго прямоугольника = " + r2.getArea());
        } 
            System.out.println("Периметр второго прямоугольника = " + r2.getArea());
        } 
    }
}