public class Main {

    public static void main(String[] args) {

        Box box1 = new Box();
        box1.setheight(5.3);
        box1.setwidth(6);
        box1.setlength(3);
        System.out.println("The first box:");
        System.out.println("The length: " + box1.getlength());
        System.out.println("The height: " + box1.getheight());
        System.out.println("The width: " + box1.getwidth());

        Box box2 = new Box(4);
        System.out.println("The second box:");
        System.out.println("The length: " + box2.getlength());
        System.out.println("The height: " + box2.getheight());
        System.out.println("The width: " + box2.getwidth());

        Box box3 = new Box(5, 6, 9);
        System.out.println("The third box:");
        System.out.println("The length: " + box3.getlength());
        System.out.println("The height: " + box3.getheight());
        System.out.println("The width: " + box3.getwidth());

        System.out.println("Get the Area:");
        System.out.println("First box: " + box1.getArea());
        System.out.println("Second box: " + box2.getArea());
        System.out.println("Third box: " + box3.getArea());

        System.out.println("Get the Volume:");
        System.out.println("First box: " + box1.getVolume());
        System.out.println("Second box: " + box2.getVolume());
        System.out.println("Third box: " + box3.getVolume());






    }
}
