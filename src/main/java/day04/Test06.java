package day04;

public class Test06 {
  public static void main(String[] args) {
    int age = 20;
    String result = age >= 19 ? "성인" : "미성년";
    System.out.println(result);
    System.out.println(age >= 19 ? "성인" : "미성년");
    System.out.println(age >= 65 ? "성인" : false);
  }
}
