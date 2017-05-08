package com.yqc.io

/**
 * Created by yangqc on 2017/5/8.
 */
class GetDirectoryContent {
    static final FILE_PATH = "D:/GitRepository"

    //递归显示当前目录下的所有文件及其子目录
    static void getAllChildDirectory() {
        new File(FILE_PATH).eachFileRecurse {
            file -> println(file.getAbsoluteFile())
        }
    }

    static void main(String[] args) {
        def rootFiles = new File(FILE_PATH).listRoots()
        rootFiles.each {
            file -> println(file.absolutePath)
        }
        println("\n=====================")
        getAllChildDirectory()
    }
}
