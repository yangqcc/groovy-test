package com.yqc.basic

/**
 * Created by yangqc on 2017/5/8.
 */
class ForInTest {
    static void main(String[] args) {
        int[] array = [0, 1, 2, 3];
        for (int i in array) {
            print(i)
        }

        println("\n========================")
        //for inҲ������ѭ����Χ
        for (int i in 1..5) {
            print(i)
        }
        println("\n========================")
        //for in ���ڷ���map
        def employee = ["Ken": 21, "John": 25, "Sally": 22]
        for (emp in employee) {
            println(emp)
        }
    }
}
