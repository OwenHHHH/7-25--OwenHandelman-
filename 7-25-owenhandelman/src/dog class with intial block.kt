class Dog(val name: String,
          weight_param: Int,
          breed_param: String){
   init {
       print("Dog $name has been created.")
   }
   var activities = arrayOf("walks")
    val breed = breed_param.toUpperCase()
    init{
        println(" The breed is $breed")
    }
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    val weightInKgs: Double
        get() = weight / 2.2
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main () {
    val doge = Dog("Doggo", 70, "mixed")
    doge.bark()
}