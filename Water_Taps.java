import java.util.Scanner;
public class water{
    public static void main(String[] args){
        int x,y;
        Scanner scan= new Scanner(System.in);
        x=scan.nextInt();
        y=scan.nextInt();
        System.out.println((x*y)/(x+y));
    }
}