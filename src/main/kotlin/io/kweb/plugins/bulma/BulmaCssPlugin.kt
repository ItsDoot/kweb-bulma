package io.kweb.plugins.bulma

import io.kweb.plugins.KWebPlugin

class BulmaCssPlugin : KWebPlugin() {

    override fun decorate(startHead: StringBuilder, endHead: StringBuilder) {
        startHead.append(
            """
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css">
            <script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            """.trimIndent()
        )
    }
}

val bulmaCssPlugin = BulmaCssPlugin()

val bulma: BulmaCssClasses get() = BulmaCssClasses()