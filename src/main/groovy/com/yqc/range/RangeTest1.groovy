package com.yqc.range

/**
 * Created by yangqc on 2017/5/9.
 */
class RangeTest1 {
    static void main(String[] args) {
        //������Χ
        def rang1 = 1..10
        println(rang1)

        //��ռ��Χ
        def range2 = 1..<10
        for (x in range2) {
            print(x)
        }
        println()

        //��ΧҲ�����ַ������
        def rangeSequence = 'a'..'x'
        //��ΧҲ���Խ�������
        def rangeDes = 10..1
        //��ΧҲ�����ַ�����������
        def rangeSequenceDes = 'x'..'a'
        println("��������ַ���")
        for (x in rangeSequenceDes) {
            print(x)
        }
        println()

        println("��������ַ���")
        for (x in rangeSequence) {
            println(x)
        }
    }
}
