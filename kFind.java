import java.util.*;

class kFind{
    public static void main(String[] args) {
        int[] arr = {16, 17, 6, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        Arrays.sort(arr);

        if (k > 0 && k <= arr.length) {
            System.out.println("The " + k + "th minimum element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of k");
        }
    }
}
