class Vet {
    fun giveShot (animal: Animal) {
        println("Vet performs field surgery on $animal.")
        animal.makeNoise()
    }
}