import java.util.*;

public class Main {
    
    public static char fun(char[] arr, int n) {
        char ans = 0;
        for(int i=0; i<n; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        
        System.out.println(fun(arr, n));
        sc.close();
    }
    
}
