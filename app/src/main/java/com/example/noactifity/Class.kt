package com.example.noactifity
class Motor()

class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact (1, "mary@gmail.com")

    //print value dari properti: email
    println(contact.email)

    //Update value dari properti: email
    contact.email = "jane@gmail.com"

    //print value baru dari properti: email
    println(contact.email)
}