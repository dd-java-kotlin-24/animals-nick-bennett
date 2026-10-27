package edu.cnm.deepdive.animals

class Coyote() : Canis() {

    init {
        println("Coyote instance initialization")
    }

    constructor(x: Int) : this() {
        println("Coyote secondary constructor")
    }

    override fun vocalize() {
        println("Bark, howl, sing, and whine")
    }

    override fun hunt() {
        println("Hunt solo or in packs or scavenge")
    }

    companion object {

        init {
            println("Coyote static (companion object) initialization")
        }

    }
}