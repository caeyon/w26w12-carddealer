package kr.ac.kumoh.s20220625.w26w12_carddealer.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CardController {
    @GetMapping("/cards/random")
    fun getRandomCards(model: Model): String {
        model.addAttribute(
            "cards",
            "ace_of_diamonds.png"
        )
        return "cards"
    }
}