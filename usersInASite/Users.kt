class Users() {

    var name = values.name()
    var followers = values.followers()
    fun check() {
        if (followers < 100000){
            println("Hello ${name} You'll qualify for the ${tiers.BRONZE} level when you've gained ${100000 - followers} followers")
    }else if(followers > 99999 && followers < 499999) {
            println("Hello ${name} You're at the ${tiers.BRONZE} level and you'll reach the ${tiers.GOLD} level after getting ${500000 - followers} followers")
    } else if (followers > 499999 && followers < 999999) {
            println("Hello ${name} You're at the ${tiers.GOLD} level and you'll reach the ${tiers.PLATINUM} level after getting ${1000000 - followers} followers")
    } else if (followers > 999999) {
            println("Hello ${name} You're at the ${tiers.PLATINUM} level")
    } else {
            throw Exception("Please try checking again")
    }
               }

    enum class tiers {
        BRONZE,
        GOLD,
        PLATINUM;
    }
}