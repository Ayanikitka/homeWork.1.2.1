fun main() {
    val currentComission = .0075
    val minimalComission = 35_00

    val amount = 10000_00

    var commission = amount * currentComission
    if (commission < minimalComission) commission = minimalComission.toDouble()
    println(commission.toInt())
}