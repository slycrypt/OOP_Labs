public class Main2 {

    public static void main(String[] args) {
        int first;

        Queue queue2 = new Queue(2);
        queue2.addElement(25);
        queue2.addElement(42);
        queue2.show();
        queue2.deleteElement();
        queue2.show();
        queue2.addElement(32);
        queue2.addElement(-20);
        queue2.show();
        queue2.addElement(-201);
        queue2.show();
        first =queue2.deleteElement();
        System.out.println("The deleted element is: " + first );
        queue2.show();

    }
}
