import java.util.Scanner;
public class frame{
    public static void main(String[] args){
        int x,y,z;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        z=read.nextInt();
        System.out.println(z*(2*(x+y)));
    }
}