package algorithmtoolbox.w2;

import java.util.*;

public class W2E4_LCM {
  private static long lcm_fast(long a, long b) {
    return a * b / gcd_fast(a, b);
  }

  private static long gcd_fast(long a, long b) {
    if (b == 0)
      return a;

    if (a > b) return gcd_fast(b, a % b);
    else return gcd_fast(a, b % a);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_fast(a, b));
  }
}
