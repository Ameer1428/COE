import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        int d = ob.nextInt();
        int avg = (a+b+c+d)/4;
        System.out.println(avg);
    }
}
