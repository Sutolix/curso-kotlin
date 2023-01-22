fun main() {
    val peopleToTestsExecutations: People = People(2000, "Jhon")

    peopleToTestsExecutations.wakeUp()
    peopleToTestsExecutations.sleep()

    // os dois modos são iguais, o de baixo apenas é mais fácil de ler em determinadas situações

    with(peopleToTestsExecutations) {
        wakeUp()
        sleep()
    }
}