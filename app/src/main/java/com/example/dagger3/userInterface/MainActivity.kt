package com.example.dagger3.userInterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.dagger3.R
import com.example.dagger3.databinding.ActivityMainBinding
import com.example.dagger3.dependencyInjection.ViewModelFactory
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.view.*
import javax.inject.Inject


class MainActivity : DaggerAppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = activityMainBinding.root
        setContentView(view)

        viewModel = ViewModelProviders.of(this, viewModelFactory)[MainActivityViewModel::class.java]

                activityMainBinding.incrementBtn.setOnClickListener { activityMainBinding.tv2.text = "${viewModel.incrementData}"
                activityMainBinding.decrementBtn.setOnClickListener { activityMainBinding.tv2.text = "${viewModel.decrementData}"
            }
        }
    }
}