package com.example.domain.usecases

import com.example.domain.offers.TestRepository
import com.example.domain.test.model.list.TestListItem
import javax.inject.Inject
import javax.inject.Singleton


class IncrementNumberUseCase @Inject constructor(private val testRepository: TestRepository){

    fun increment(): Int {
        val getNum = testRepository.getExampleItemFromServer()
        return getNum.length + 20
    }

}