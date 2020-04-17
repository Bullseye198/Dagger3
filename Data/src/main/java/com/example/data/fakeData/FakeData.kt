package com.example.data.fakeData

import javax.inject.Inject

class FakeData  @Inject constructor() {

    var fakeData = arrayOf("Marco", "Christoph", "Martin")

    var fakeDataTwo = mapOf("Hanako" to 1, "Envidual" to 2, "iic" to 3)

    var fakeDataThree = "Random String"
}