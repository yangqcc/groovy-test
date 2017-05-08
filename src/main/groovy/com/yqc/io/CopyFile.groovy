package com.yqc.io

/**
 * Created by yangqc on 2017/5/8.
 * 复制文件,这复制文件也太TM方便了吧
 */
class CopyFile {
    static void main(String[] args) {
        def src = new File(IoTest1.FILE_PATH)
        def dest = new File("D:/GroovyFile.txt")
        dest << src.text
    }
}
