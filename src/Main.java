public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] monthlyLedger = {50, 100, 200, 500, 1000};
        int ledgerSum = 0;
        for (int i : monthlyLedger) {
            ledgerSum += i;
        }
        System.out.println("Сумма трат за месяц составила " + ledgerSum + " рублей");

        // Задача 2
        int[] weeklyLedger = {234, 89, 9, 1861, 480};
        int minSum = 65535;
        int maxSum = -1;
        for (int j : weeklyLedger) {
            if (j > maxSum) {
                maxSum = j;
            }
            if (j < minSum) {
                minSum = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSum + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxSum + " рублей");

        // Задача 3
        int[] weeklyLedger2 = {384, 8, 1765, 861, 80};
        int ledgerSum2 = 0;
        for (int i : weeklyLedger2) {
            ledgerSum2 += i;
        }
        double average = (double) ledgerSum2 / weeklyLedger2.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}