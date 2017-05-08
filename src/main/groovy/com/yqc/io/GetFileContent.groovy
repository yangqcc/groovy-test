package com.yqc.io
/**
 * Created by yangqc on 2017/5/8.
 */
class GetFileContent {
    static final String FILE_PATH = "D:/GitRepository/groovy-test/src/main/resources/Example.txt"

    static void main(String[] args) {
        File file = new File(FILE_PATH);
        file.eachLine {
            line -> println "line:$line"
        }
        println("\n======================")
        //���ļ����ݶ�ȡ���ַ���
        println(file.text)
        println("\n======================")
        //��ȡ�ļ���С
        println("The file ${file.absolutePath} has ${file.length()} bytes")
    }
}
