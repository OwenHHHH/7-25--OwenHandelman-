class Lynx: Feline() {
    override val image = "lynx.jpg"
    override val food = "rabbits"
    override val habitat = "forests"


    override fun makeNoise() {
        println("Screeech! Screeech! Screeech!")
    }

    override fun eat() {
        println("The Lynx eats $food")
    }
}