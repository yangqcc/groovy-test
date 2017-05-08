package com.yqc.io

/**
 * Created by yangqc on 2017/5/8.
 * ´´½¨Ä¿Â¼
 */
class CreateDirectory {
    static void main(String[] args) {
        def file = new File("D:/GroovyDirectory")
        println("is directory created ? ${file.mkdir()}")
    }
}
