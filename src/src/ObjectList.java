import java.util.Random;

public class ObjectList {
    private int numElements = 0;
    private Object[] myShapes = new Object[100]; // caps at 100 elements with no bullet-proofing or bounds checks, etc.

    /**
     * Adds item to this list without checking for array bounds.
     *
     * @param shape value to add to the list
     */
    public void add(Object shape) {
        myShapes[numElements++] = shape;
    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of this list
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numElements; i++) {
            result.append(myShapes[i]).append(" ");
        }
        return result.toString();
    }

}
