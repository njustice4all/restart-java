package day02;

public class Test06 {
  static final float f = 12.375f;

  public static void main(String[] args) {
    System.out.println(0.1f * 0.1f); // 결과 같이 예상한 값과 다르다.
    // 이유?
    // => 부동소수점을 이진수로 바꿀 때 아~~주 작은 수의 오차가 있을 수 있다.
    //

    // 그래서 부동소수점을 비교할 때 정수 비교할 때 처럼 단순하게 비교하면
    // 원하는 결과를 얻을 수 없다.
    // 다음의 결과를 보라!
    System.out.println(0.1f * 0.1f == 0.01f); // true를 예상 ==> 그러나 false

    // 해결 방안
    // => 예상한 값과의 오차가 부동소수점에서 인정하는 오차 이하의 값이면 같은 것으로 취급하라!
    System.out.println((0.1f * 0.1f - 0.01f) <= Float.POSITIVE_INFINITY);

  }
}
