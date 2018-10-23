public class TailZeroCalculator {

    public static void main(String[] args) {
        System.out.println("Please, enter a positive number:");
        String input = System.console().readLine();
        try {
            int N = Integer.parseInt(input);
            System.out.println(calculate(N));
        } catch (NumberFormatException e) {
            System.out.println("Please, enter a number.");
        }
    }

    /** Алгоритм:
     * необходимо посчитать, сколько раз число 5 учавствует в умножении,
     * так как 0 на конце даёт одновременное появление множителя 2 и 5.
     * */
    static int calculate(int N) {
        int count = 0;
        for (int i = 5; i < N; i = i * 5) {
            count += Math.floor(N / i);
        }
        return count;
    }
}
