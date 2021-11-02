package com.android.kotlin.basics.quick_guide.unit2

//
// Created by $梁振 on 2021/10/9.
//

class Test {
    companion object{
        val numbers= listOf(1,2,3,4,5,6)
        private val string=listOf("red", "blue", "green")
        val entrees= mutableListOf<String>()
        @JvmStatic
        fun main(args: Array<String>) {
//           test()
           testString()
//            var squareCabin:SquareCabin
//            with(squareCabin) {
//                println("Capacity: ${capacity}")
//                println("Material: ${buildingMaterial}")
//                println("Has room? ${hasRoom()}")
//            }
        }
        fun testList(){
            println("正序 $string")
            println("倒序 ${string.reversed()}")
            println("The sum of numbers is ${numbers.size},the first is  ${numbers[0]}")
            for (entry in string){
                entrees.add(entry)
                println(entrees.last())
            }
            entrees[0]="dasdassda"
            println(entrees[0])
            entrees.removeAt(0)
            println(entrees[0])
            var index=0
            while (index< numbers.size){
                println(numbers[index])
                index++
            }
        }
        fun testString(){
            val name = "Android"
            println(name.length)
            val number = 10
            val groups = 5
            println("$number people")
            println("${number * groups} people")
        }
    }
}