package com.yqc.string

/**
 * Created by yangqc on 2017/5/9.
 * ���Բ���String����
 */
class StringMethods {
    static void main(String[] args) {
        String name = "Hello"
        //length()����ȷ���ַ�������
        println(name.length())

        //����һ���µĳ���ΪnumberOfChars���ַ��������ַ����������Ҳ��ÿո��ַ������ַ�����ɡ�
        println(name.center(30) + "=")

        //void eachMatch(String regex, Closure clos)
        //����ÿ��������ʽ�飨�μ���һ�ڣ�ƥ��ĸ���String�����ַ�����
        println(name.each { s -> println s })
    }
}
