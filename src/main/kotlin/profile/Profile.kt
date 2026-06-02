package profile

fun main() {
    val profiles = ProfilesRepository.profiles;
//    val olderThan25: (Person) -> Boolean =  {person: Person -> person.age > 25 }
//    val filtered = filter(profiles) {it.age > 25}
//
//    for(profile in filtered) {
//        println(profile)
//    }

    val ages = transform(profiles) { it.copy(age = it.age + 1) }
    for(name in ages) {
        println(name)
    }
}

fun filter(people: List<Person>, isSuitable: (Person) -> Boolean): List<Person> {
    val result = mutableListOf<Person>()
    for (person in people) {
        if (isSuitable(person)) {
            result.add(person)
        }
    }
    return result
}

fun <R> transform(profiles: List<Person>, operation: (Person) -> R): List<R> {
    val result = mutableListOf<R>()
    for(product in profiles) {
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