package profile

fun main() {
    val profiles = ProfilesRepository.profiles;
    var filtered = filter(profiles, object: Condition {
        override fun isSuitable(person: Person): Boolean {
            return person.age > 25
        }
    })

    filtered = filter(filtered, object: Condition {
        override fun isSuitable(person: Person): Boolean {
            return person.firstName.startsWith('A')
        }
    })

    filtered = filter(filtered, object: Condition {
        override fun isSuitable(person: Person) : Boolean {
            return person.gender == Gender.MALE
        }
    })

    for(profile in filtered) {
        println(profile)
    }
}

fun filter(people: List<Person>, condition: Condition): List<Person> {
    val result = mutableListOf<Person>()
    for(person in people) {
        if(condition.isSuitable(person)) {
            result.add(person)
        }
    }
    return result
}