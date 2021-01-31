import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}")
    dayOfWeek()
}

fun dayOfWeek() {
    var day = ""

    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
    }
    println("What day is it today? $day")
}