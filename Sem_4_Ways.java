import java.util.Scanner;

public class Sem_4_Ways {
     
      public static void main(String[] args) {
        System.out.println(F(2, 22222));
      }
    
      //
      // N ->
      // / F(N-1) , N mod 2 != 0
      // F(N) = { F(N-1) + F(N/2), N mod 2 = 0
      // \ 1, N = 2
      //
      //
      static int F(int a, int b) {
        //System.out.println(b);
        // new Scanner(System.in).nextLine();
        if (b == a)
          return 1;
        else if (b < a) {
          return 0;
        } else if (b % 2 != 0)
          return F(a, b - 1);
        else
          return F(a, b - 1) + F(a, b / 2);
      }
}
    
    // N ->  

