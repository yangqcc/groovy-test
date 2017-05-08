package com.yqc.basic

/**
 * Created by yangqc on 2017/5/8.
 *
 * Groovy支持范围的概念，并在..符号的帮助下提供范围运算符的符号。
 */
class RangeTest {
    static void main(String[] args) {
        def range = 5..10
        println(range)
        println(range.get(2))
    }
}
