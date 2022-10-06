import java.util.*

fun main() {
    // комментарий
    /*
    Многострочный
     */
    println("Hello World!")
    //println()
    val a: Int = 100 // value - immutable - неизменяемая
  //  a = 200
    var b = 200  // variable - mutable
    println(b::class)
    b = 500

    val a1: Byte = -10
    val b1: Short = 45
    var c1: Int = -250
    val d1: Long = 3000L

    val h: Double = 4.5
    var f: Float = 4.5F

    val flag: Boolean = true // false
    val ch: Char = 'A'
    val name = "Ivan"
    val lastname = "Ivanov"

    c1 = d1.toInt()
    f = h.toFloat()

    println("$name $lastname")

    val x1 = 11
    val y1 = 5
    val z1 = x1/y1 // 2

    val x2 = 11
    val y2 = 5.0
    val z2 = x2/y2 // 2.2

    // % - остаток от деления

  //  val scanner = Scanner(System.`in`)
//    val x = scanner.nextInt()

  //  val y = readLine()?.toInt()
  //  val yy = readln().toInt()

    val(cc,ccc) = readln().split(" ").map{ it.toInt() }
    println("$cc $ccc")

    var str: String = "abc"
  //  str = null

    var str2: String? = "abc"
   // str2 = null
    val l = if(str2 != null) str2.length else -1
    val l2 = str2?.length ?: -1 // elvis expression
    println(str2?.length)

    var w1 = 5    // 6
    var w2 = ++w1  // 6

    var w3 = 5     // 6
    var w4 = w3++   // 5


    val g = 10
    if(g == 10) {
        println("")
    } else if (g > 7) {

    } else {

    }
    var s = 10
    var p = 20
    var result = if(s>p) {
        println("s = $s")
        s
    } else {
        println("p = $p")
        p
    }
    // > < != ==
    // тип логической операции in

    val q = 5
    val r1 = q in 1..6 // [1,6] true (or false)
    var r2 = q !in 20 downTo 5

    when(flag) {
        true -> {
            // что-то делай
        }
        false -> println("")
        else -> println("")
    }
    val m = 10
    when(m) {
        10,20,30 -> println("or")
        else -> println(0)
    }
    when(m) {
        in 10..19 -> println()
        in 20..29 -> println()
        !in 10..39 -> println()
    }
    val j = 10
    val i = 20
    var r = 50
    when(i+i+j) {
        i-r+100 -> { }
        i+40 -> {}
    }
    val sum = 1000
    val rate = when (sum) {
        in 100..999 -> 20
        in 1001..100_000 -> 50
        else -> 20
    }
    var k1 = 15
    val k2 = 6
    when {
        (k1<10) -> { }
        (k2>100) -> { }
    }

    when(val kk = k1+k2) {
        100 -> { }
        200 -> { }
    }



}