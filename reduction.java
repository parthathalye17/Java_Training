import java.util.ArrayList;

public class reduction {
    public static void main(String[] args) {
        String a = "aabbccddeeffgg";
        char[] arr = a.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                result.add("" + arr[i] + count); 
                count = 1; 
            }
        }
        result.add("" + arr[arr.length - 1] + count);
        for (String s : result) {
            System.out.print(s);
        }
    }
}
