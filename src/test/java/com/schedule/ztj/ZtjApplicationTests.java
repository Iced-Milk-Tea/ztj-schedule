package com.schedule.ztj;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Comparator;

@SpringBootTest
class ZtjApplicationTests {

    @Test
    void test02() {
        int x = 50;
        x = ++x * 2;
        System.out.println(x);
    }

    @Test
    void contextLoads() throws CloneNotSupportedException {

        CompareStrLen compareStrLen = new CompareStrLen();
        CompareStrLen compareStrLen2 = new CompareStrLen();
        compareStrLen2 = (CompareStrLen) compareStrLen.clone();

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("123");
        listStr.add("12");
        listStr.add("1");
        listStr.add("1456789");
        listStr.add("11");
        listStr.clone();
//        listStr.sort(new CompareStrLen());
        listStr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = o1.length();
                int i2 = o2.length();
                return i1 == i2 ? 0 : (i1 < i2 ? 1 : -1);
            }
        });

        System.out.println(listStr);
    }

}
