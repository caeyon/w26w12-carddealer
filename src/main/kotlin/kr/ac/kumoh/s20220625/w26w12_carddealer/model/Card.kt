package kr.ac.kumoh.s20220625.w26w12_carddealer.model

data class Card(
    val rank: String,
    val suit: String,
) {
    val imageName: String
        get() = "${rank}_of_${suit}.png"
}
