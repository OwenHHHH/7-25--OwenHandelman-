class Hippo : Animal() {
    //init{
       // image = "hippo.jpg"
    //}
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("the Hippo is eating $food")
    }

}