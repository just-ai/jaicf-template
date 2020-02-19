package com.justai.jaicf.template

import com.justai.jaicf.channel.googleactions.ActionsFulfillment
import com.justai.jaicf.channel.googleactions.servlet.ActionsFulfillmentServlet
import com.justai.jaicf.channel.webhook.JettyWebhook

fun main(args: Array<String>) {
    JettyWebhook(
        port = System.getenv("PORT")?.toInt() ?: 8080,
        servlets = mapOf(
            "/" to ActionsFulfillmentServlet(ActionsFulfillment.dialogflow(templateBot))
        )
    ).start()
}