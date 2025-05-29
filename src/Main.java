import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задание № 1 ");
        int total = 0;
        int[] spent = new int [5] ;
        //Scanner scan = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < spent.length  ; i++)
        {
            spent[i] = random.nextInt(100, 100000);
            //System.out.println("Выплата  № " + (i + 1));
            // spent[i] = scan.nextInt();
        }
        for (int i : spent)
        {
            total = total + i;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");
        System.out.println("Задание № 2 ");
        int min = spent[1], max = 0;
        for (int i: spent)
        {
            if (min > i) {
                min = i;
            }
            if (max < i){
                max = i;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Задание № 3 ");
        float avarege = (float) (total / spent.length);

        System.out.println("Средняя сумма трат за месяц составила " + avarege + " рублей.");
        System.out.println("Задание № 4 ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //char[] reverseFullName = { 'a','t', 'e', 'v', 'S', ' ', 'a','v', 'o', 'n', 'a', 'v', 'I'};

        char save;
        for (int i = 0; i < reverseFullName.length/2; i++){
            save = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = save;
        }
        for (char c : reverseFullName)
        {
            System.out.print(c);
        }
    }
}