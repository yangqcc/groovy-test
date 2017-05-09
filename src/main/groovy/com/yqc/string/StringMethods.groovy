package com.yqc.string

/**
 * Created by yangqc on 2017/5/9.
 * 测试部分String方法
 */
class StringMethods {
    static void main(String[] args) {
        String name = "Hello"
        //length()用于确定字符串长度
        println(name.length())

        //返回一个新的长度为numberOfChars的字符串，该字符串由左侧和右侧用空格字符填充的字符串组成。
        println(name.center(30) + "=")

        //void eachMatch(String regex, Closure clos)
        //处理每个正则表达式组（参见下一节）匹配的给定String的子字符串。
        println(name.each { s -> println s })
    }
}
