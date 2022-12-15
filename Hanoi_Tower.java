import java.util.Scanner;

public class Hanoi_Tower {
    /*
     * функция перемещения дисков башни, где n - число дисков, from_rodName -
     * стержень, с которого берем диск,
     * to_rodName - стержень, на который перемещаем диск, statRodname - стержень, на
     * котороым диск не перемещается
     * в данный момент времени (для текущей итерации метода).
     */

    static void hanoiTower(int n, char from_rodName, char to_rodName, char statRodName) {
        if (n == 1) {
            System.out.println("Двигаем диск 1 из стержня " + from_rodName + " на стержень " + to_rodName);
            return;
        }
        hanoiTower(n - 1, from_rodName, statRodName, to_rodName);
        System.out.println("Двигаем диск " + n + " из стержня" + from_rodName + " на стержень " + to_rodName);
        hanoiTower(n - 1, statRodName, to_rodName, from_rodName);
    }

    // Вызов метода перемещения дисков
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество дисков в игре: ");
        int n = in.nextInt();
        in.close();
        hanoiTower(n, 'A', 'C', 'B');

    }
}
