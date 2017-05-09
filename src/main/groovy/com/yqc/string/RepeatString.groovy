package com.yqc.string

/**
 * Created by yangqc on 2017/5/9.
 *
 * 句法:
 * 字符串的重复可以通过简单的\'*\'运算符完成。
 * String*number
 *
 * 参数:
 * 参数将为 一个字符串作为*操作符的左操作数
 * 操作符右侧的数字，表示字符串需要重复的次数。
 *
 * 返回值:
 * 返回值是一个字符串。
 **/
class RepeatString {
    static void main(String[] args) {
        String name = "Hello"
        println(name * 3)
    }
}
