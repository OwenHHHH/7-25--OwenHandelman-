class Cheetah: Feline() {
    override val image = "cheetah.jpg"
    override val food = "gazelles"
    override val habitat = "savannah"


    override fun makeNoise() {
        println("Screeech! Screeech! Screeech!")
    }

    override fun eat() {
        println("The Cheetah  eats $food")
    }
}