package profile

fun main() {
    val profiles =
        ProfilesRepository.profiles.sortedBy { it.firstName }.forEach { println(it) }
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