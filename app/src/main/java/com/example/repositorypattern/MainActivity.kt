package com.example.repositorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.repositorypattern.model.Employee
import com.example.repositorypattern.presenter.Presenter

class MainActivity : AppCompatActivity(),ViewInterface {

    private lateinit var presenter : Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = Presenter(this)
    }

    override fun showEmployees(list: ArrayList<Employee>) {

    }

    override fun showDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}
