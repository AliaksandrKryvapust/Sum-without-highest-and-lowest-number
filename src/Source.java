import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] arr = new int[] { 6, 2, 1, 8, 10};
        System.out.println(sum(arr)==16);
    }
    public static int sum(int[] numbers)
    {
        return (numbers==null || numbers.length<=1)? 0 : Arrays.stream(numbers).sum() - Arrays.stream(numbers).max().getAsInt() - Arrays.stream(numbers).min().getAsInt();
    }
}
