fun main() {
    val likes = 212
    val choice = 100
    val human = "людям"
    val people = "человеку"

    var result: Int = likes % choice
    if (result != 1 || result ==11) {
        println("Запись понравилась $likes $human")
    } else
        println("Запись понравилась $likes $people")

}
