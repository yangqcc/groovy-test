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
        //将文件内容读取到字符串
        println(file.text)
        println("\n======================")
        //获取文件大小
        println("The file ${file.absolutePath} has ${file.length()} bytes")
    }
}
