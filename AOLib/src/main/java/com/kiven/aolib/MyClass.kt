package com.kiven.aolib

data class User(var name: String, var age: String)
data class Teacher(var name: String) {
    var user: User? = null
    fun getStudent(): String {
        return user?.toString() ?: ""
    }
}