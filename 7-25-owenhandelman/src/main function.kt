fun main() {
    val animals = arrayOf(Hippo(), Wolf(), Fox(), Lion(), Lynx(), Cheetah())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    val fox = Fox()
    val lion = Lion()
    val lynx = Lynx()
    val cheetah = Cheetah()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
    vet.giveShot(fox)
    vet.giveShot(lion)
    vet.giveShot(lynx)
    vet.giveShot(cheetah)
}