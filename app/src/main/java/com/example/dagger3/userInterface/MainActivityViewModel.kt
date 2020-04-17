package com.example.dagger3.userInterface

import androidx.lifecycle.ViewModel
import com.example.domain.usecases.DecrementNumberUseCase
import com.example.domain.usecases.IncrementNumberUseCase
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
   private val incrementNumberUseCase: IncrementNumberUseCase,
   private val decrementNumberUseCase: DecrementNumberUseCase
)
    : ViewModel(){

    val incrementData = incrementNumberUseCase.increment()
    val decrementData = decrementNumberUseCase.decrement()

}