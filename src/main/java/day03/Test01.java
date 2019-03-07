package day03;

public class Test01 {
  public static void main(String[] args) {
    // 1바이트 정수 값을 담을 메모리 준비
    byte b1;
    byte b2;
    byte b3;

    b1 = -128; // 리터럴 값이 비록 4바이트 크기이지만 메모리에 넣을 수 있다면 허락한다.
    b2 = 127; // OK
    //b2 = 127L; // 단 8바이트 값은 담을 수 있더라도 허락하지 않는다. 컴파일 오류!
    //b3 = 128; // 128은 1바이트 메모리에 담을 수 없기 때문에 컴파일 오류가 발생한다.

    // 2바이트 정수 값을 담을 메모리 준비
    short s1;
    short s2;
    short s3;

    s1 = -32768; // OK
    s2 = 32767; // OK
    // s2 = 300L; // 컴파일 오류!
    //s3 = 32768; // 컴파일 오류!

    // 4바이트 정수 값을 담을 메모리 준비
    int i1;
    int i2;
    int i3;

    i1 = -2100000000; // OK
    i2 = 2100000000;// OK
    //i2 = 2100000000L; // 컴파일 오류! 8바이트 값을 4바이트 메모리에 넣을 수 없다.
    //i3 = 2200000000; // 리터럴 표현 오류! 4바이트를 초과하는 값을 표현했다.

    // 8바이트 정수 값을 담을 메모리 준비
    long l1;
    long l2;
    long l3;
    l1 = 9000000000000000000L;
    //l2 = 9900000000000000000L; // 8바이트 리터럴 표현 오류.

    // 4바이트 부동소수점을 담을 메모리 준비
    float f1;
    float f2;

    f1 = 98765.43f;
    f2 = 98765.43456789f; // 유효 자릿수를 넘어 가는 경우 짤려서 저장된다.
    // 정수 메모리와 달리 컴파일 오류가 발생하지 않는다.
    // 그래서 더더욱 주의해서 사용해야 한다.
    System.out.println(f1);
    System.out.println(f2);

    f1 = 9876.543f;
    f2 = 12.34567f;
    System.out.println(f1);
    System.out.println(f2);

    // 8바이트 부동소수점을 담을 메모리 준비
    double d1;
    double d2;

    d1 = 98765.43; // 주의! 8바이트 부동소수점을 표현할 때는 f, F 접미사를 제거하라.
    d2 = 98765.43456789;
    double d3 = 999.12345;
    System.out.println(d1);
    System.out.println(d2); // 유효자릿수 15자리까지 대부분 짤리지 않고 들어간다.
    System.out.println(d3);

    // 논리 값을 담을 메모리 준비
    boolean bool1;
    boolean bool2;
    boolean bool3;

    bool1 = true;
    bool2 = false;
    //bool3 = 1; // 컴파일 오류! true, false 외의 다른 값은 저장할 수 없다.

    // 문자의 UTF-16 코드 값을 담을 메모리 준비
    char c1;
    char c2;
    char c3;

    c1 = 44032; // 4바이트 정수 리터럴이더라도 0 ~ 65535까지의 값이라면
    // char 메모리에 저장하는 것을 허락한다.
    c2 = 0xac00;
    c3 = '가'; // '' 의 리턴 값은 2바이트(0 ~ 65535) 유니코드 정수 값이다.

    System.out.println(c1); // 변수 자체가 char 이기 때문에 (char)를 붙이지 않아도 된다.
    System.out.println(c2);
    System.out.println(c3);
  }
}
