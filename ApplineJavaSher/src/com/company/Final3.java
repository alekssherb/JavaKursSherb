import java.util.Scanner;
public class Final3 {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int kolstrok = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[kolstrok];
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Введите cтроку " + x + ":");
            arr[j] = sc.nextLine();
            x = x +1;
        }
        String maxuniksl = null;
        int uniqsimvol = 0;
        for (String word : arr) {
            int count = 0;
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        if (i == j) {
                            count++;
                        }
                        break;
                    }
                }
            }
            if (count > uniqsimvol) {
                uniqsimvol = count;
                maxuniksl = word;
            }
        }
        System.out.println("Количество строк: "+ kolstrok);
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Строка " + y + ": " + arr[j]);
            y = y+1;
        }
        System.out.println("Ответ: " + maxuniksl);
    }
}