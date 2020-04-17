package com.example.domain.usecases

import com.example.domain.offers.TestRepository
import javax.inject.Inject

class DecrementNumberUseCase @Inject constructor(private val testRepository: TestRepository) {

    fun decrement(): Int {
        val getNum = testRepository.getExampleItemFromServer()
        return getNum.length - 5
    }

}