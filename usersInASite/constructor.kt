import java.util.Scanner

object values{

    fun name():String{
        println("What is your name")
        var scanner = Scanner(System.`in`)
        var name = scanner.nextLine()
        return name
    }
    fun followers():Int{
        println("How many followers do you have")
        var scanner = Scanner(System.`in`)
        var followers = scanner.nextInt()
        return followers
    }
}