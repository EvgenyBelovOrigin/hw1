package ru.netology

import kotlin.math.round

fun main() {
    val purchaseAmount = 15_000_00 // сумма в копеейках
    val isVipClient = true
    val vipDiscount = 0.01
    val discountFirst = 100_00 // сумма в копейках
    val amountFirst = 1_000_00 // сумма в копейках
    val discountSecond = 0.05
    val amountSecond = 10_000_00 //сумма в копейках
    var discount = if (purchaseAmount > amountFirst)
        if (purchaseAmount > amountSecond)
            if (isVipClient) (purchaseAmount * discountSecond + (purchaseAmount - purchaseAmount * discountSecond) * vipDiscount)
            else purchaseAmount * discountSecond
        else
            if (isVipClient) discountFirst + (purchaseAmount - discountFirst) * vipDiscount
            else discountFirst
    else if (isVipClient) purchaseAmount * vipDiscount
    else 0
    var purchaseAmountDiscounted = purchaseAmount.toInt() / 100 - round((discount.toDouble() / 100))



    println("Сумма покупки $purchaseAmountDiscounted руб.")

}