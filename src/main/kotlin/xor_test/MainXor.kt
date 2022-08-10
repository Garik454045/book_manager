fun main() {
    val array = arrayOf(2, 100, 2, 100, 3, 30, 30)

    var acc = 0

    (array.indices).forEach { i ->
        acc = acc xor array[i]
        println(acc)
    }

    println(acc)
}
