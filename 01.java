import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        int starCount = 0, hashCount = 0;
        
        for(char ch : s.toCharArray()) {
            if(ch == '*') starCount++;
            else if(ch == '#') hashCount++;
        }
        
        int result = starCount - hashCount;
        System.out.print(result);
    }
}
