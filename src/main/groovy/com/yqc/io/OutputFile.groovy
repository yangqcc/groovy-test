package com.yqc.io

/**
 * Created by yangqc on 2017/5/8.
 * д���ļ�,��ĺܷ���
 */
class OutputFile {
    static void main(String[] args) {
        new File("Output.txt").withWriter('utf-8') {
            writer -> writer.writeLine "Hello,World!"
        }
    }
}
