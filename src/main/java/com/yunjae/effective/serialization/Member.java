package com.yunjae.effective.serialization;

import java.io.Serializable;

/**
 * 직렬화 회원 클래스
 */
public class Member implements Serializable {
    private String name;
    private String email;
    private int age;

    public Member(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Getter 생략

    @Override
    public String toString() {
        return String.format("Member{name='%s', email='%s', age='%s'}", name, email, age);
    }
}