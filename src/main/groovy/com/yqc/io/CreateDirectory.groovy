package com.yqc.io

/**
 * Created by yangqc on 2017/5/8.
 * ����Ŀ¼
 */
class CreateDirectory {
    static void main(String[] args) {
        def file = new File("D:/GroovyDirectory")
        println("is directory created ? ${file.mkdir()}")
    }
}
