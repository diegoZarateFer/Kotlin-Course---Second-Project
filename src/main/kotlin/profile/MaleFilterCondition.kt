package profile

class MaleFilterCondition: Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.gender == Gender.MALE
    }
}