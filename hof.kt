class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {

    // forEach applies code inside {} to each item in list
    // cookies.forEach {
    //     println("Menu item: ${it.name}")
    // }

    // map lets you transform a collection into a new collection with the same number of elements
    // val fullMenu = cookies.map {
    //     "${it.name} - $${it.price}"
    // }

    // println("Full menu:")
    // fullMenu.forEach {
    //     println(it)
    // }

    // filter lets you create a subset of a collection
    // val softBakedMenu = cookies.filter {
    //     it.softBaked
    // }

    // println("Soft cookies:")
    // softBakedMenu.forEach {
    //     println("${it.name} - $${it.price}")
    // }

    // groupBy() function can be used to turn a list into a map, based on a function.
    // val groupedMenu = cookies.groupBy { it.softBaked }
    // val softBakedMenu = groupedMenu[true] ?: listOf()
    // val crunchyMenu = groupedMenu[false] ?: listOf()

    // println("Soft cookies:")
    // softBakedMenu.forEach {
    //     println("${it.name} - $${it.price}")
    // }

    // println()

    // println("Crunchy cookies:")
    // crunchyMenu.forEach {
    //     println("${it.name} - $${it.price}")
    // }

    // fold() function is used to generate a single value from a collection
    // calculate total price of cookies 
    val totalPrice = cookies.fold(0.0) {total, cookie ->
        total + cookie.price
    }
    println("total price: $${totalPrice}")
}
