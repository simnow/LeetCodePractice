package com.android.kotlin.basics.quick_guide.unit1

/**
 * Test.kt
 * kotlin 基础学习
 * Kotlin 簡介 瞭解如何以現代程式設計語言 Kotlin 編寫程式碼，讓程式設計更簡單明瞭且易於存取。
 * https://developer.android.google.cn/courses/pathways/android-basics-kotlin-one
 * @author liangzhen
 * @date 2021/10/4 11:15 下午
 *
 */
class Test {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
//            repeatBorder(roll())
//            repeatCakeBottom(11,3)
//            elseIf(10,4)
//            elseIf(3,4)
//            elseIf(4,4)
//            whenC(roll())
//            val myFirstDice = Dice(6)
//            print(myFirstDice.roll())
        }
        private fun roll(): Int {
            return (1..10).random()
        }
        private fun repeatBorder(times:Int){
            repeat(times){
                print("===")
            }
        }

        private fun repeatCakeBottom(age:Int,layers:Int){
            repeat(layers){
                repeat(age+2){
                    print("@")
                }
                println()
            }
        }

        private fun elseIf(num: Int,toNum: Int){
            if (num>toNum){
                println("The variable is greater than ${toNum}")
            }else if (num==toNum){
                println("The variable is equal to ${toNum}")
            }else{
                println("The variable is less than ${toNum}")
            }
        }

        private fun whenC(num:Int){
            var luckyNumber=7
            when (num) {
                luckyNumber -> {
                    println("You won!")
                }
                1 -> println("So sorry! You rolled a 1. Try again!")
                2 -> println("Sadly, you rolled a 2. Try again!")
                3 -> println("Unfortunately, you rolled a 3. Try again!")
                4 -> println("No luck! You rolled a 4. Try again!")
                5 -> println("Don't cry! You rolled a 5. Try again!")
                6 -> println("Apologies! you rolled a 6. Try again!")
                else ->{
                    println("You back!")
                }
            }
        }
    }
}