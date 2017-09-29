package com.yqc.dynamic

/**
 * 动态的设置类型
 * Created by yangqc on 2017/5/8.
 */
class DynamicVariable {
    static void main(String[] args) {
        def a = 100
        println(a)

        def b = 100.10
        println(b)

        b = "this is String"
        println(b)

        def c = 100.101
        println(c)

        def d = "Hello,World"
        println(d)
    }
}
