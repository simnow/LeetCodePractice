package com.android.kotlin.basics.quick_guide.unit1

/**
 * Dice.kt
 * 含参数的类别
 * @author liangzhen
 * @date 2021/10/4 11:19 下午
 *
 */
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}