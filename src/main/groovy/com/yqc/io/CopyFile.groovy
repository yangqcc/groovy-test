package com.yqc.io

/**
 * Created by yangqc on 2017/5/8.
 * �����ļ�,�⸴���ļ�Ҳ̫TM�����˰�
 */
class CopyFile {
    static void main(String[] args) {
        def src = new File(IoTest1.FILE_PATH)
        def dest = new File("D:/GroovyFile.txt")
        dest << src.text
    }
}
