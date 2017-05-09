package com.yqc.string

/**
 * Created by yangqc on 2017/5/9.
 *
 * Groovy中的字符串是字符的有序序列。字符串中的单个字符可以通过其位置访问。这由索引位置给出。
 * 字符串索引从零开始，以小于字符串长度的一个结束。 Groovy还允许负索引从字符串的末尾开始计数。
 */
class StringIndex {
    static void main(String[] args) {
        def range = -1..2
        String sample = "Hello World"
        println(sample[4])
        println(sample[-1])
        println(sample[1..2])
        println(sample[range])
        println(sample[4..2])//Prints a string starting from Index 4 back to 2
    }
}
