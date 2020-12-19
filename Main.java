import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Emter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i<500; i++){

            System.out.println("The inputed number is " + ++n);
        }
        in.close();
    }
}