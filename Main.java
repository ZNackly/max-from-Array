import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        
        while (true) {
            int num = scanner.nextInt();
            
            if (num == -1) {
                System.out.println(max);
            } else if (num == 0) {
                break;
            } else if (num > max) {
                max = num;
            }
        }
    }
}
