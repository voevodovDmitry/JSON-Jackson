import java.util.Arrays;

public class ArrayData {
    public int[] arr;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "arr: " + Arrays.toString(arr);
    }
}
