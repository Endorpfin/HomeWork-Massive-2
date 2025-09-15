import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        //#1
        int[] salary = {10000, 15000, 12000, 14000, 11000};
        int salaryGeneral = 0;
        for (int i = 0; i <= salary.length - 1; i++) {
            salaryGeneral += salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + salaryGeneral + " рублей");

        System.out.println("Задача 2");
        //#2
        int[] salary1 = {10000, 15000, 12000, 14000, 11000};
        int salaryMin = salary1[0];
        int salaryMax = salary1[0];
        for (int i = 0; i <= salary1.length - 1; i++) {
            if (salary1[i] < salaryMin) {
                salaryMin = salary1[i];
            }
            if (salary1[i] > salaryMax) {
                salaryMax = salary1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + salaryMin +
                " рублей." + " Максимальная сумма трат за неделю составила " + salaryMax + " рублей.");

        System.out.println("Задача 3");
        //#3
        int[] salary2 = {10000, 15000, 12000, 14000, 11000};
        int salaryAverage = 0;
        for (int i = 0; i <= salary2.length - 1; i++) {
            salaryAverage += salary2[i] / salary2.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + salaryAverage + " рублей");

        System.out.println("Задача 4");
        //#4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(reverseFullName);
    }
}

