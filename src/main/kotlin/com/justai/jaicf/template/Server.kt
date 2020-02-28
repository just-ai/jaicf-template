package com.justai.jaicf.template

import com.justai.jaicf.channel.googleactions.ActionsFulfillment
import com.justai.jaicf.channel.webhook.JettyWebhook

fun main() {
    JettyWebhook(port = System.getenv("PORT")?.toInt() ?: 8080)
        .channels("/" to ActionsFulfillment.dialogflow(templateBot))
        .start()
}