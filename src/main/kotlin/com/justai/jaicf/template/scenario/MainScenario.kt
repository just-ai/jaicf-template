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

        fallback {
            reactions.say("I have nothing to say yet...")
            reactions.actions?.run {
                say("Bye bye!")
                endConversation()
            }
        }

        /**
         * Add more states with activators here. For example:
         *
         * state("my_state") {
         *   activators {
         *     intent("MY_INTENT")
         *   }
         *   action {
         *     reactions.say("My intent has been received.")
         *   }
         *   state("my_inner_state") {
         *     activators {
         *       intent("ANOTHER_INTENT")
         *     }
         *     action {
         *       reactions.say("The inner state was activated via another intent.")
         *     }
         *   }
         * }
         */
    }
}