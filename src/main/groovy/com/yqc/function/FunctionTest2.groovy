package com.yqc.function

/**
 * Created by yangqc on 2017/5/8.
 */
class FunctionTest2 {

    //由于是静态方法,所以可以直接调用
    static def DisplayName() {
        println("This is how methods work in groovy!")
        println("This is an example of a simple method!")
    }

    static void sum(a, b) {
        int c = a + b
        println(c)
    }

    static void main(String[] args) {
        DisplayName()
        sum(12,12f)
    }
}
