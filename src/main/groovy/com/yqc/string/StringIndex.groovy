package com.yqc.string

/**
 * Created by yangqc on 2017/5/9.
 *
 * Groovy�е��ַ������ַ����������С��ַ����еĵ����ַ�����ͨ����λ�÷��ʡ���������λ�ø�����
 * �ַ����������㿪ʼ����С���ַ������ȵ�һ�������� Groovy�������������ַ�����ĩβ��ʼ������
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
