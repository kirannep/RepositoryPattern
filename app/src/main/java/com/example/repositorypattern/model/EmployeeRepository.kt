package com.example.repositorypattern.model

interface EmployeeRepository {

    fun retrieveEmloyees():ArrayList<Employee>
}