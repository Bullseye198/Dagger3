package com.example.domain.offers

import com.example.domain.test.model.list.TestListItem

interface TestRepository {

    fun getExampleItemFromServer(): TestListItem

    suspend fun fetchAndStoreAllActiveData(): List<TestListItem>
}