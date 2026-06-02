package profile

fun main() {
    val profiles =
        ProfilesRepository.profiles.filter { it.age > 25 }.filter { it.gender == Gender.MALE }.filter { it.age < 30 }
            .transform { it.copy(age = it.age + 1) }

    for (profile in profiles) {
        println(profile)
    }
}

fun List<Person>.filter(isSuitable: (Person) -> Boolean): List<Person> {
    val result = mutableListOf<Person>()
    for (person in this) {
        if (isSuitable(person)) {
            result.add(person)
        }
    }
    return result
}

fun <R> List<Person>.transform(operation: (Person) -> R): List<R> {
    val result = mutableListOf<R>()
    for (product in this) {
        result.add(operation(product))
    }

    return result
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