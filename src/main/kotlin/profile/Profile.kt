package profile

fun main() {
    val profiles = ProfilesRepository.profiles

    showEmail(profiles)
}

fun showEmail(profiles: List<Person>) {
    println("Enter id: ")
    val id = readln().toInt()

    val userEmail = profiles.find { it.id == id }
    val result = userEmail?.let { "Email: ${it.email}" } ?: "User Not Found"

    println(result)
}

//fun filter(people: List<Person>, condition: Condition): List<Person> {
//    val result = mutableListOf<Person>()
//    for(person in people) {
//        if(condition.isSuitable(person)) {
//            result.add(person)
//        }
//    }
//    return result
//}