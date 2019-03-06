package day02;

public class Test10 {
  public static void main(String[] args) {
    System.out.println("Hello,\nworld!");  // 줄바꿈은 이 제어 문자를 사용하라!
    System.out.println("Hello,\rworld!");
    System.out.println("Hello,\b\b\bworld!");
    System.out.println("Hello,\tworld!");
    System.out.println("Hello,\fworld!");
    System.out.println("Hello,\"w\"orld!");
    System.out.println("Hello,'w'orld!");
    System.out.println('\'');
    System.out.println('"');
    System.out.println("Hello,\\\\\\world!");
  }
}
