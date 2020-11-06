package com.justai.jaicf.template

import com.justai.jaicf.BotEngine
import com.justai.jaicf.channel.googleactions.dialogflow.ActionsDialogflowActivator
import com.justai.jaicf.template.scenario.MainScenario

val templateBot = BotEngine(
    model = MainScenario.model,
    activators = arrayOf(
        ActionsDialogflowActivator
    )
)