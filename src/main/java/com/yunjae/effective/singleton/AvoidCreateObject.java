package com.yunjae.effective.singleton;

import java.util.regex.Pattern;

public class AvoidCreateObject {

    // Performance can be greatly improved!
    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // String.matches 가 가장 쉽게 정규 표현식에 매치가 되는지 확인하는 방법이긴 하지만
    // 성능이 중요한 상황에서 반복적으로 사용하기에 적절하지 않는다.
    // String.matches 는 내부적으로 Pattern 객체를 만들어 쓴ㄴ데 그 객체를 만들려면 정규 표현식으로 유한 상태 기계로
    // 검파일 하는 과정이 필요한다.  즉 비싼 객체다.
    // 성능을 개선하면 Pattern 객체를 만들어 재사용하는 것이 좋다.
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral2(String s) {
        return ROMAN.matcher(s).matches();
    }


    public static void main(String[] args) {
        String a = new String("bikini");
        String b = new String("bikini");

        System.out.println(a == b);

        System.out.println("a == b : " + (a == b));

        String c = "bikini";
        String d = "bikini";

        System.out.println("c == d : " + (c == d));

        System.out.println(new Boolean("true"));    // create new instance (java9 deprecated)
        System.out.println(Boolean.valueOf("true"));    // singleton instance

        // 팩토리 메소드 사용
        Boolean true1 = Boolean.valueOf("true");
        Boolean true2 = Boolean.valueOf("true");
        System.out.println("true1 == true2 : " + (true1 == true2));
        System.out.println("true1 == Boolean.TRUE : " + (true1 == Boolean.TRUE));
    }
}
