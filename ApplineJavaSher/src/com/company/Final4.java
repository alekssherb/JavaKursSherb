import java.util.Scanner;
public class Final4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.println("Попробуй отгадать загадку:\n" +
                "“Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”\n" +
                "Для подсказки введи: Подсказка");
        String otvet = "Заархивированный вирус";
        String userotvet;
        while (count <= 3) {
            System.out.printf("Попытка №%d: ", count);
            userotvet = sc.nextLine();
            if (otvet.equalsIgnoreCase(userotvet)) {
                System.out.println("Правильно!");
                break;
            } else if (userotvet.equalsIgnoreCase("Подсказка") && count == 1) {
                System.out.println("Сжатый вирус");
            } else if (userotvet.equalsIgnoreCase("Подсказка") && count > 1) {
                System.out.println("Подсказка уже недоступна");
            } else if (count < 3){
                count++;
                System.out.println("Подумай ещё!");
            } else {
                count++;
                System.out.println("Обидно, приходи в другой раз ");
            }
        }
    }
}

