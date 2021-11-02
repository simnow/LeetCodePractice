package com.android.kotlin.basics.quick_guide.unit1
/**
 * Dice0.kt
 * 无参数类
 * @author liangzhen
 * @date 2021/10/4 11:18 下午
 *
 */
class Dice0 {
    var sides = 6

    fun roll() {
        val randomNumber: Int = (1..6).random()
        println(randomNumber)
    }
}