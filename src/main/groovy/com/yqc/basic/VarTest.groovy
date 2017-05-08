package com.yqc.basic

/**
 * Created by yangqc on 2017/5/8.
 */
class VarTest {

    def myFunction(name, age) {
        print("Your name is: " + name + ", and you age is: " + age)
    }

    def static defaultVariable(name, age = 25) {
        if (age == null) {
            println("Your name is :" + age, " and your age is sercret!")
        } else {
            println("Your name is :" + name + ", and your age is:" + age)
        }
    }

    public static void main(String[] args){
        defaultVariable("shijia")
    }
}
