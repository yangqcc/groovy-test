package com.yqc.range

/**
 * Created by yangqc on 2017/5/9.
 */
class RangeTest1 {
    static void main(String[] args) {
        //������Χ
        def rang1 = 1..10
        //��ռ��Χ
        def range2 = 1..<10
        //��ΧҲ�����ַ������
        def rangeSequence = 'a'..'x'
        //��ΧҲ���Խ�������
        def rangeDes = 10..1
        //��ΧҲ�����ַ�����������
        def rangeSequenceDes = 'x'..'a'

        for (x in rangeSequence) {
            println(x)
        }
    }
}
