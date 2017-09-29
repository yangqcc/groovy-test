package com.yqc.range

/**
 * Created by yangqc on 2017/5/9.
 */
class RangeTest1 {
    static void main(String[] args) {
        //°üº¬·¶Î§
        def rang1 = 1..10
        println(rang1)

        //¶ÀÕ¼·¶Î§
        def range2 = 1..<10
        for (x in range2) {
            print(x)
        }
        println()

        //·¶Î§Ò²¿ÉÒÔ×Ö·û´®×é³É
        def rangeSequence = 'a'..'x'
        //·¶Î§Ò²¿ÉÒÔ½µÐòÅÅÁÐ
        def rangeDes = 10..1
        //·¶Î§Ò²¿ÉÒÔ×Ö·û´®½µÐòÅÅÁÐ
        def rangeSequenceDes = 'x'..'a'
        println("½µÐò±éÀú×Ö·û´®")
        for (x in rangeSequenceDes) {
            print(x)
        }
        println()

        println("ÉýÐò±éÀú×Ö·û´®")
        for (x in rangeSequence) {
            println(x)
        }
    }
}
