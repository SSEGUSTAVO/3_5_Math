import java.util.Scanner;

class entrada{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Primera entrada: ");
        int x = input.nextInt();
	System.out.println("Segunda entrada: ");
        int y = input.nextInt();
        System.out.println("Tercera entrada: ");
        int z = input.nextInt();
        int sum;
        sum = x+y+z;
        System.out.println("Número: " + sum);
        input.close();
    }
}