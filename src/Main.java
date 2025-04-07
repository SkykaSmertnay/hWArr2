import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        //Задание № 1
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

        //Задание № 2
        int min = spent[1], max = 0;
        for (int i: spent)
        {
            if (min > i)
                min = i;

            if (max < i)
                max = i;
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        //Задание № 3
        float avarege = (float) (total / 4);

        System.out.println("Средняя сумма трат за месяц составила " + avarege + " рублей.");
        //Задание № 4
        int spaceInd = 0;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // char[] reverseFullName = { 'a','t', 'e', 'v', 'S', ' ', 'a','v', 'o', 'n', 'a', 'v', 'I'};
        for (char i : reverseFullName)
        {
            if (i == ' ')
            {
                break;
            }
            spaceInd++;
        }
        char save;
        int counter1 = 1;
        int length = reverseFullName.length;
        for (int i = 0; i < reverseFullName.length; i++)
        {
            if (i < spaceInd / 2)
            {
                save = reverseFullName[i];
                reverseFullName[i] = reverseFullName[spaceInd - counter1];
                reverseFullName[spaceInd - counter1] = save;
                counter1++;

            }
            else if (spaceInd < i && i < (length - 1))
            {
                save = reverseFullName[i];
                reverseFullName[i] = reverseFullName[length - 1];
                reverseFullName[length-1] = save;
                length--;
            }


        }
        for (char c : reverseFullName)
        {
            System.out.print(c);
        }

    }
}