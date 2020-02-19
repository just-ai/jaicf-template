package com.justai.jaicf.template

import com.justai.jaicf.Bot
import com.justai.jaicf.activator.catchall.CatchAllActivator
import com.justai.jaicf.channel.googleactions.dialogflow.ActionsDialogflowActivator
import com.justai.jaicf.template.scenario.MainScenario

val templateBot = Bot(
    model = MainScenario.model,
    activators = arrayOf(
        ActionsDialogflowActivator,
        CatchAllActivator
    )
)