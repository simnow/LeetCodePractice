package com.android.kotlin.basics.quick_guide.unit2

/**
 * SquareCabin.kt
 * TODO
 * @author liangzhen
 * @date 2021/10/9 3:38 下午
 *
 */
class SquareCabin : Dwelling() {
    override val buildingMaterial: String
        get() = buildingMaterial + "Not yet implemented++=="

    override fun floorArea(): Double {
        return 100.00
    }
}