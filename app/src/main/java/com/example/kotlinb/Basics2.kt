open class Cricketer(val name: String, val age: Int, val nationality: String)
{
    open fun print()
    {
        println("Name: $name, age: $age, Nationality: $nationality")
    }
}

interface Batsman
{
    var score: Int
    var batsmanRanking: Int

    fun printBatsmanDetails()
    {
        println("Score: $score, Batsman Ranking: $batsmanRanking")
    }

    fun getRanking(name: String)
    {}
}

