import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // total monkeys
        int m = sc.nextInt(); // total bananas
        int p = sc.nextInt(); // total peanuts
        int k = sc.nextInt(); // bananas per monkey
        int j = sc.nextInt(); // peanuts per monkey 
        sc.close();
        
        // monkeys that ate bananas
        int bananaMonkeys = m/k;
        if( m % k != 0) bananaMonkeys++;
        
        // monkeys that ate peanuts
        int peanutMonkeys = p/j;
        if(p % j != 0) peanutMonkeys++;
        
        // total monkeys left tree 
        int totalEatingMonkeys = bananaMonkeys + peanutMonkeys;
        
        // remaining monkeys on tree
        int remaining = n - totalEatingMonkeys;
        
        System.out.println(remaining);
        
    }
}
