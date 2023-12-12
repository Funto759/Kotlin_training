import java.util.*

class Aquarium {
    init {
        println("Volume of Your Aquarium")
    }

    fun scan(): String {
        println("What is the length of the Aquarium")
        val scanner = Scanner(System.`in`)
        val length = scanner.nextInt()

        println("What is the width of the Aquarium")
        val scanne = Scanner(System.`in`)
        val width = scanne.nextInt()

        println("What is the height of the Aquarium")
        val scann = Scanner(System.`in`)
        val height = scann.nextInt()

        val all = ("Length: $length Width: $width Height: $height")
        val volume = ("Volume: ${(width * length * height) / 1000}")
        return (all + "\n" + volume)
    }

}