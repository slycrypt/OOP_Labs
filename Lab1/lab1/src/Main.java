public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.createMonitor( 21f, 1920, "gray");
        Monitor monitor2 = new Monitor();
        monitor2.createMonitor(22f, 1920, "black");
        monitor1.compareMonitor(monitor2);
        monitor1.setColor("green");
        System.out.println("\nThe monitor after update:\n"  +
                "Dimension:" + monitor1.dimension + "\nResolution:"+ monitor1.resolution + "\nColor:" + monitor1.color);
    }
}