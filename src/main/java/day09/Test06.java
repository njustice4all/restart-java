package day09;

public class Test06 {
  public static void main(String[] args) {

    String s1 = new String("Hello");

    // String 인스턴스가 한 번 생성되면 절대로 값을 바꿀 수 없다.
    // => 이런 것을 "immutable 객체"라 부른다.
    String s2 = s1.replace('l', 'x');

    String s3 = s1.replace("ll", "dd");

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
    System.out.println(s1 == s3);
  }
}
