package com.yqc.function

/**
 * Created by yangqc on 2017/5/8.
 *
 * Groovy�л���һ���涨��ָ�������еĲ�����Ĭ��ֵ�� ���û��ֵ���ݸ������ķ�������ʹ��ȱʡֵ��
 * ���ʹ�÷�Ĭ�Ϻ�Ĭ�ϲ����������ע�⣬Ĭ�ϲ���Ӧ�ڲ����б��ĩβ���塣
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
