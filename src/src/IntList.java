import java.util.Arrays;
import java.util.Random;

/**
 * For Class Design - convert to IntList
 */
public class IntList {
    private int numElements = 0;
    private int[] data = new int[100]; // caps at 100 elements with no bullet-proofing or bounds checks, etc.

    /**
     * Adds item to this list without checking for array bounds.
     *
     * @param item value to add to the list
     */
    public void add(int item) {
        data[numElements++] = item;
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
            result.append(data[i]).append(" ");
        }
        return result.toString();
    }

    public int sum(){
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum;
    }

    public int indexOf(int target){
        data = bubbleSort(data);
        if(data == null){
            return -1;
        }else if(data.length == 1){
            if(data[0] == target){
                return 0;
            } else{
                return -1;
            }
        }
        int low = 0;
        int high = data.length - 1;
        while(high >= low){
            int mid = low + (high-low)/2;
            if (data[mid] == target) {
                return mid;
            } else {
                if (data[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        IntList a = new IntList();
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            a.add(random.nextInt(100) + 1);
        }
        System.out.println(a.toString() );
        System.out.println(a.sum() );
        System.out.println(a.indexOf(random.nextInt(100) + 1));
        System.out.println(a.indexOf(random.nextInt(100) + 1));
    }

    public static int[] bubbleSort(int[] data) {
        int counter = 0; //counter sees if it can make it through with all pairs sorted
        while(counter < data.length -1) {
            counter = 0;
            for (int j = 0; j < data.length - 1; j++) {
                if(data[j] <= data[j+1]){
                    counter ++;
                } else{
                    data = swapper(data, j, j+1);
                }
            }
        }
        return data;
    }
    public static int[] swapper(int[] data, int pos1, int pos2){
        int temp = data[pos1];
        data[pos1] = data[pos2];
        data[pos2] = temp;
        return data;
    }
}
