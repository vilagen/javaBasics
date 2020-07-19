public class Rectangle {
    // variables should be private.
    private int height;
    private int width;


    // a constructor is a method which runs when you create a new object
    // meant to initialize objects; set them up and ready to be used.
    // Constructor will be called the same as a the class
    // it will also have no return type.
    public Rectangle(int h, int w) {

        setHeight(h);
        setWidth(w);
        System.out.println("Rectangle Created.");

    }

    // and methods should be public
    // never knew this but...
    // accessibility (public), return type (void), name (setHeight)
    public void setHeight(int h) {
        if (h > 0) {
            height = h;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int w) {
        if (w > 0) {
            width = w;
        }
    }

    public int getWidth() {
        return width;
    }

    // when you don't specify public or private,
    // then has default accessibility known as
    // Package Private
    // meaning it's accessible from anywhere in the same package.
//    void printArea() {
//        System.out.println(height * width);
//    }

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return (2 * height) + (2 * width);
    }

}
