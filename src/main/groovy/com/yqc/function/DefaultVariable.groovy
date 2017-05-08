package com.yqc.function

/**
 * Created by yangqc on 2017/5/8.
 *
 * Groovy中还有一个规定来指定方法中的参数的默认值。 如果没有值传递给参数的方法，则使用缺省值。
 * 如果使用非默认和默认参数，则必须注意，默认参数应在参数列表的末尾定义。
 */
class DefaultVariable {

    static void sum(int a, int b = 5) {
        int c = a + b
        println(c)
    }

    static void main(String[] args) {
        sum(6)
        sum(6, 6)
    }
}
