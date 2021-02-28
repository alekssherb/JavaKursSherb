import java.util.Scanner;
public class Final2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y, z;
        System.out.print("Введите уравнение: ");
        String equation = sc.nextLine();
        if (equation.charAt(0) == 'x') {
            y = Integer.parseInt(String.valueOf(equation.charAt(2)));
            z = Integer.parseInt(String.valueOf(equation.charAt(4)));
            if (equation.charAt(1) == '-') {
                System.out.println("x = " + (z + y));
            } else {
                if (y > z) {
                    System.out.println("x = -" + (y - z));
                } else {
                    System.out.println("x = " + (z - y));
                }
            }
        } else if (equation.charAt(2) == 'x') {
            y = Integer.parseInt(String.valueOf(equation.charAt(0)));
            z = Integer.parseInt(String.valueOf(equation.charAt(4)));
            if (equation.charAt(1) == '-') {
                if (y > z) {
                    System.out.println("x = " + (y - z));
                } else {
                    System.out.println("x = -" + (z - y));
                }
            } else {
                if (y > z) {
                    System.out.println("x = -" + (y - z));
                } else {
                    System.out.println("x = " + (z - y));
                }
            }
        } else if (equation.charAt(4) == 'x') {
            y = Integer.parseInt(String.valueOf(equation.charAt(0)));
            z = Integer.parseInt(String.valueOf(equation.charAt(2)));
            if (equation.charAt(1) == '-') {
                if (y > z) {
                    System.out.println("x = " + (y - z));
                } else {
                    System.out.println("x = -" + (z - y));
                }
            } else {
                System.out.println("x = " + (y + z));
            }
        } else {
            System.out.println("Попробуй запустить заново");
        }
    }
}
