class Fox: Canine() {
    override val image = "wolf.jpg"
    override val food = "rodents"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Ning Ning Yip Yip")
    }

    override fun eat() {
        println("The Fox is eating $food")
    }
}