package com.yqc.basic

/**
 * Created by yangqc on 2017/5/8.
 */
class ObjectFunction {
    static int x = 100;
    def name = "yangqc"

    public int getX() {
        return x
    }

    public void setX(int pX) {
        x = pX
    }

    static int getVariable() {
        //lx的作用域仅仅处在getVariable里面
        int lx = 200
        println(lx)
        return x
    }

    String getName() {
        //可以使用this关键字访问实例成员
        this.name
    }

    static void main(String[] args) {
        ObjectFunction of = new ObjectFunction()
        of.setX(12)
        println(of.getX())
        getVariable()
        println(of.getName())
    }
}
