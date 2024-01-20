import java.util.ArrayList;
public class longest {
    public static void main(String[] args) {
        String a = "abcabcbb";
        char[] arr = a.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        String s = "";
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i+1]){
                s+=arr[i];
            }
        }
        System.out.println(s);
    }
}