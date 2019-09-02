package com.example.repositorypattern

import android.view.View
import com.example.repositorypattern.model.Employee

interface ViewInterface {
    fun showEmployees(list:ArrayList<Employee>)
    fun showDestroy()
}