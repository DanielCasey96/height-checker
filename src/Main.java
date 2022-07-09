import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.heightChecker(new int[]{1,2,3,4,5});
    }

    public int heightChecker(int[] heights) {

        int counter = 0;
        int[] sortedArray = new int[heights.length];

        System.arraycopy(heights, 0, sortedArray, 0, heights.length);
        Arrays.sort(sortedArray);

        for(int i = 0; i<heights.length; i++) {
            if(sortedArray[i]!=heights[i]) {
                counter++;
            }
        }
        return counter;
    }
}
