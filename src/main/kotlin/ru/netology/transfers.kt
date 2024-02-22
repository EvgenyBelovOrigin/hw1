package ru.netology

fun main() {
    val amount = 3_000_00 // сумма в копейках
    val feeRate = 0.0075
    val minFee = 35_00 // сумма в копейках
    var feeResult = if (amount * feeRate < minFee) minFee / 100 else amount * feeRate / 100
    println("Комиссия за перевод: $feeResult руб.")

}




