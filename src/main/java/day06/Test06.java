package day06;

public class Test06 {
  public static void main(String[] args) {
    // 합계를 출력하는 프로그램을 작성하라.
    // $ java -cp ./bin/main ch06.Test14 200 43 56
    //
    int sum = 0;
    for (String arg : args)
      sum += Integer.parseInt(arg);
    System.out.printf("합계: %d\n", sum);
  }
}
