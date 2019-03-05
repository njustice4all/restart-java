package day02;

public class Test02 {
  public static void main(String[] args) {
    // 20 억을 4바이트 리터럴로 출력하라.
    System.out.println(2000000000);

    // 20 억을 8바이트 리터럴로 출력하라.
    System.out.println(2000000000L);
    System.out.println(2000000000l);

    // 30 억을 8바이트 리터럴로 출력하라.
    System.out.println(3000000000L);

    // 30 억을 4바이트 리터럴로 출력하라.
    //System.out.println(3000000000); // 컴파일 오류!
  }
}
