package com.example.data.fakeData

import com.example.domain.offers.TestRepository
import com.example.domain.test.model.list.TestListItem
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakeDataRepositoryImpl @Inject constructor() : TestRepository {

    override suspend fun fetchAndStoreAllActiveData(): List<TestListItem> {
        val fakeList = TestListItem()
        return emptyList()
    }

    override fun getExampleItemFromServer(): TestListItem {
        return TestListItem()
    }
}