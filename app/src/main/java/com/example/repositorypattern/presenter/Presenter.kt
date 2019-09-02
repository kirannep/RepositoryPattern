package com.example.repositorypattern.presenter

import com.example.repositorypattern.PresenterInterface
import com.example.repositorypattern.ViewInterface
import com.example.repositorypattern.model.Employee
import com.example.repositorypattern.model.EmployeeDataSource

class Presenter(_view:ViewInterface):PresenterInterface {

    var view:ViewInterface = _view
    var employeeList:EmployeeDataSource? = null

    override fun getEmployees() {
//        var list = employeeList!!.getEmployees()
//        view.showEmployees(list)
    }

    override fun onDestroy() {
        view.showDestroy()
    }

}