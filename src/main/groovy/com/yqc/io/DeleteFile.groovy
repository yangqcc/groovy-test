package com.yqc.io

/**
 * Created by yangqc on 2017/5/8.
 * É¾³ýÎÄ¼þ
 */
class DeleteFile {
    static void main(String[] args) {
        def file = new File("D:/GroovyDirectory")
        println("is directory deleted? ${file.delete()}")
    }
}
