package com.yqc.io

/**
 * Created by yangqc on 2017/5/8.
 * �鿴·�����ļ�����Ŀ¼
 */
class IsDirectory {
    static void main(String[] args) {
        def file = new File("D:/")
        println("File? ${file.isFile()}")
        println("Directory? ${file.isDirectory()}")
    }
}
