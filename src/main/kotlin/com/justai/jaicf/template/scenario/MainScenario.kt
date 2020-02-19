package com.justai.jaicf.template.scenario

import com.justai.jaicf.channel.googleactions.actions
import com.justai.jaicf.channel.googleactions.dialogflow.DialogflowIntent
import com.justai.jaicf.model.scenario.Scenario

object MainScenario: Scenario() {

    init {
        state("main") {
            activators {
                intent(DialogflowIntent.WELCOME)
            }

            action {
                reactions.say("Hi there!")
            }
        }

        state("fallback", noContext = true) {
            activators {
                catchAll()
            }

            action {
                reactions.say("I have nothing to say yet...")
                reactions.actions?.run {
                    say("Bye bye!")
                    endConversation()
                }
            }
        }
    }
}