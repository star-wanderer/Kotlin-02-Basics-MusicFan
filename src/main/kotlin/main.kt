package ru.netology

fun main (){

    val purchaseAmountDiscount = 0.05
    val purchaseThresholdDiscount = 100
    val purchaseConstantCustomerDiscount = 0.01
    val lowThreshold = 1001
    val highThreshold = 10000

    var purchaseAmount = 10500.0
    var purchaseAmountWithDiscount = 0.0
    var constantCustomer = false
    var discountActivated = false

    if ( purchaseAmount >= lowThreshold && purchaseAmount < highThreshold ) {
        purchaseAmountWithDiscount = purchaseAmount - purchaseThresholdDiscount
        discountActivated = true
    } else if (purchaseAmount >= highThreshold + 1) {
        purchaseAmountWithDiscount = purchaseAmount - (purchaseAmount * purchaseAmountDiscount)
        discountActivated  = true
    }

    if (constantCustomer) {
        purchaseAmountWithDiscount -=purchaseAmountWithDiscount * purchaseConstantCustomerDiscount
        discountActivated  = true
    }

    if (discountActivated) {
        println("К оплате с учетом скидки: $purchaseAmountWithDiscount Рублей")
    }
    else  {
        println("К оплате: $purchaseAmountWithDiscount Рублей")
    }
}