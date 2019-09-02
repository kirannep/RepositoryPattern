package com.example.repositorypattern.model

class EmployeeRepositoryImplementation:EmployeeRepository {

    var dataSource = EmployeeDataSource()

    override fun retrieveEmloyees(): ArrayList<Employee> {
        return dataSource.getEmployees()
    }

}