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
        boolean flagotvet = true;
        boolean flag = false;
        while (count <= 3) {
            System.out.printf("Попытка №%d: ", count);
            userotvet = sc.nextLine();
            if (otvet.equalsIgnoreCase(userotvet)) {
                System.out.println("Правильно!");
                flagotvet = false;
                break;
            } else if (userotvet.equalsIgnoreCase("подсказка")){
                if (count == 1) {
                    flag = true;
                    System.out.println("Сжатый вирус");
                } else {
                    System.out.println("Подсказка уже не доступна");
                    continue;
                }
            } else {
                if (count == 2 && flag) {
                    break;
                } else if (count == 1 || count == 2) {
                    System.out.println("Подумай еще!");
                }
            }
            count++;
        }
        if (flagotvet){
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}

