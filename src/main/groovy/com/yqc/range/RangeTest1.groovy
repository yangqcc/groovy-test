package com.yqc.range

/**
 * Created by yangqc on 2017/5/9.
 */
class RangeTest1 {
    static void main(String[] args) {
        //包含范围
        def rang1 = 1..10
        //独占范围
        def range2 = 1..<10
        //范围也可以字符串组成
        def rangeSequence = 'a'..'x'
        //范围也可以降序排列
        def rangeDes = 10..1
        //范围也可以字符串降序排列
        def rangeSequenceDes = 'x'..'a'

        for (x in rangeSequence) {
            println(x)
        }
    }
}
