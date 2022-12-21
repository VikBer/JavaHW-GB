public class Sem_4_Ways {

    public static void main(String[] args) {
        System.out.println(f(25000));
    }

    private static int f(int n) {
        if (n < 2)
            return 1;

        int[] fs = new int[n];
        fs[0] = fs[1] = 1;

        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                fs[i] = fs[i / 2] + fs[i / 2 - 1];
            } else {
                fs[i] = fs[(i - 1) / 2] + fs[(i - 1) / 2 - 1];
            }
        }
        return fs[n - 1];
    }
}
