import java.util.ArrayList;

public class ExceptionList {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World!");
        myList.add(42);
        myList.add("Goodbye Cruel World :(");

        for (int i = 0; i < myList.size(); i++) {
            try {
                System.out.println((Integer) myList.get(i));
                System.out.println();
            }
            catch (ClassCastException e) {
                System.out.println(e.getMessage() + " at index " + i + " = " + myList.get(i));
                System.out.println();
            }
        }
    }
}