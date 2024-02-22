package ru.netology

fun main() {
    val likes = 15781
    var humanOrPeople = if (likes == 1 || (likes > 20 && likes - likes / 10 * 10 == 1)) "человеку" else "людям"
    println("Понравилось $likes $humanOrPeople")
}