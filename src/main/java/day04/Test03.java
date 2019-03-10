package day04;

public class Test03 {
  public static void main(String[] args) {
    float r = 3.2f + 5 / 2;
    System.out.println(r); // 5.2
    /*
     => 연산자 우선 순위에 따라 *, /, % 연산자가 +, - 연산자 보다 먼저 계산된다.
     => 계산 순서
         => 3.2(float) + 5(int) / 2(int)
         => 3.2(float) + 2(int)
         => 3.2(float) + 2.0f(float)
         => 5.2(float)
     */

    float r2 = (3.2f + 5) / 2;
    System.out.println(r2); // 4.1
    // 연산자 우선 순위에서 괄호는 모든 연산자 보다 우선으로 취급된다.

    int a = 2; // = 5
    int r3 = a++ + a++ * a++;
    /*
     r3 = 2 + 3 * 4    <== ++ 연산을 먼저 수행한다.
        = 2 + 12    <== * 연산을 먼저 수행한다.
        = 14
     */
  }
}
