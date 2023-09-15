package com.example.kotlinb

open class Cricketer(val name: String, val age: Int, val nationality: String)
{
    open fun print()
    {
        println("Name: $name, age: $age, Nationality: $nationality")
    }
}

interface Batsman {
    var score: Int
    var batsmanRanking: Int

    fun printBatsmanDetails() {
        println("Score: $score, Batsman Ranking: $batsmanRanking")
    }

    fun retrieveBatsmanRanking(): Int
}
interface Bowler
{
    var wickets: Int
    var bowlerRanking: Int

    fun printBowlerDetails()
    {
        println("Wickets: $wickets, Bowler Ranking: $bowlerRanking")

    }

    fun retrieveBowlerRanking(): Int
}

class AllRounder(name: String, age: Int, nationality: String) : Cricketer(name, age, nationality), Batsman, Bowler{

    override var score: Int = 0
    override var batsmanRanking: Int = 0
    override var wickets: Int = 0
    override var bowlerRanking: Int = 0
    var ranking: Int = 0

    override fun print()
    {
        super.print()
        printBatsmanDetails()
        printBowlerDetails()
    }

    override fun retrieveBatsmanRanking(): Int
    {
        return batsmanRanking
    }

    override fun retrieveBowlerRanking(): Int
    {
        return bowlerRanking
    }
}

fun main()
{
    val allRounder = AllRounder(name = "Shahid Afridi", age = 50, nationality = "Pakistan")
    allRounder.score = 34
    allRounder.batsmanRanking = 4
    allRounder.bowlerRanking = 3
    allRounder.wickets = 5
    allRounder.ranking = 4

    allRounder.print()



}
