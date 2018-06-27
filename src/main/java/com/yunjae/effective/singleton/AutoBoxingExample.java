package com.yunjae.effective.singleton;

/**
 * 오토박싱은 프리미티브 타입과 박스 타입의 경계가 안보이게 해주지만 그렇다고 그 경계를 없애주진는 않는다.
 * sum 변수의 타입을 Long 으로 만들었기 때문에 불필요한 Long 객체를 2^31 제곱개 만들게 된다.
 */
public class AutoBoxingExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum +=i;
        }

        System.out.println("sum : " + sum);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("======================================");

        long start2 = System.currentTimeMillis();
        long sum2 = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 +=i;
        }

        System.out.println("sum2 : " + sum2);
        System.out.println(System.currentTimeMillis() - start2);
    }
}
