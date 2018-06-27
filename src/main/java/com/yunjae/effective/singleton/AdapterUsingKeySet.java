package com.yunjae.effective.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map 인터페이스가 제공하는 keySet 은 Map 이 뒤에 있는 Set 인터페이스의 뷰를 제공한다.
 * keySet을 호출할 때마다 새로운 객체가 나올것 같지만 사실 같은 객체를 리턴하기 때문에
 * 리턴 받은 Set 타입의 객체를 변경하면, 결국에 그 뒤에 있는 Map 객체를 변경하게 된다.
 */
public class AdapterUsingKeySet {
    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Burger", 8);
        menu.put("Pizza", 9);

        // name1  === name2 동일한 개체
        Set<String> name1 = menu.keySet();
        Set<String> name2 = menu.keySet();

        System.out.println("name1 == name2 " + (name1 == name2));
        name1.remove("Burger");
        System.out.println(name1.size());   // 1
        System.out.println(name2.size());   // 1
        System.out.println(menu.size());   // 1
    }
}
