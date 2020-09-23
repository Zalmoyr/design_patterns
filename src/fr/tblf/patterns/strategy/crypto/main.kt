package fr.tblf.patterns.strategy.crypto

import fr.tblf.patterns.strategy.crypto.comportements.CryptoStrat
import fr.tblf.patterns.strategy.crypto.comportements.MD5
import fr.tblf.patterns.strategy.crypto.comportements.SHA256
import fr.tblf.patterns.strategy.crypto.comportements.SHA512

fun main() {
    var strat : CryptoStrat
    val message = "Hello, world !"

    println("MD5: ")
    strat = MD5()
    strat.encrypt(message)

    println("256: ")
    strat = SHA256()
    strat.encrypt(message)

    println("512: ")
    strat = SHA512()
    strat.encrypt(message)
}