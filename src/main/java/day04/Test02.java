package day04;

// 암시적 형변환
public class Test02 {
  public static void main(String[] args) {
    float r = 5 / 2 + 3.2f;
    System.out.println(r); // 5.2
    /*
     5(int) / 2(int) + 3.2f(float)
          2(int) + 3.2f(float)
          2.0f(float) + 3.2f(float)
                  5.2f(float)
     */
  }
}
