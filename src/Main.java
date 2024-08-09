import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=0,c=1,d;
        System.out.print("Fibonaccinin kaçıncı elemanına kadar?: ");
        int a = sc.nextInt();
        System.out.print(b+" "+c);
        for(int i=0;i<=a;i++){
            d=b+c;
            System.out.print(" "+d);
            b=c;
            c=d;
        }
    }
}