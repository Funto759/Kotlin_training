import java.util.*

class UserName(count: Int) {
    init {
        for (i in 1..count) {
            print("What is your First name")// enter first name
            val scan = Scanner(System.`in`)
            val firstName = scan.next()
/////////////////////////////////////////////////////////
            print("What is your Last name")//enter last name
            val scanner = Scanner(System.`in`)
            val lastName = scanner.next()
///////////////////////////////////////////////////////////
            println("User $i: $firstName $lastName")// compile the 2 names together and print it out
            }
    }
        }