package com.android.kotlin.basics.quick_guide

import com.android.kotlin.basics.quick_guide.unit1.Dice

//
// Created by $梁振 on 2021/10/21.
//

class TestObjectName {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var name1: String = "name11"
            var name2: String = "name22"
            var time: Int = 11
            var dice: Dice = Dice(123)
//            test(name1, name2, time, dice)
            val list= getList()
            val p1=People(11,"xiao1")
            println(list.size)
            println(list.indexOf(p1))
            val p2=People(12,"xiao1")
            println(list.indexOf(p1))
        }

        fun test(vararg objects: Any?) {
            for (i in 0 until objects.size) {
                println("simpleName==" + objects[i]?.javaClass?.simpleName)
            }
        }

        fun getList():List<People>{
            val mList=ArrayList<People>()
            for (i in 0..9) {
                mList.add(People(10+i,"xiao"+i))
            }
            return mList
        }
//
    }

    class People(val age1: Int,val name1 :String) {
        val name: String
            get() = "name"+name1

        fun getAge() :Int{
            return age1
        }
    }
}