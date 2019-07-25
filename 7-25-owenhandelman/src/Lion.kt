class Lion: Feline() {
    override val image = "lion.jpg"
    override val food = "gazelles"
    override val habitat = "Savannah"


    override fun makeNoise() {
        println("ROOOOOOOAAAR! ROOOOOOOAAAR! ROOOOOOOAAAR!")
    }

    override fun eat() {
        println("The Lion eats $food")
    }
}