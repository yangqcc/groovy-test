package com.yqc.number

/**
 * Created by yangqc on 2017/5/9.
 */
class BoxedAndUnboxed {
    static void main(String[] args) {
        Integer x = 5, y = 10, z = 0
        //����x��y���в���
        z = x + y
        println(z)
        println(x.floatValue().class)
        println(Math.sqrt(5.doubleValue()))
        //����ָ��ֵ
        println(Math.pow(4.1, 2.1))
        println(Math.max(x, y))
    }
}
