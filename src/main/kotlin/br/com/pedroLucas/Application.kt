package br.com.pedroLucas

import br.com.pedroLucas.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8000) {
        routing {
            get ("/") {
                call.respondText("Hello, world!")
            }
            get("/todos"){

            }
            get("/todos/{id}"){

            }

            post("/todos"){

            }

            put("/todos/{id}"){

            }

            delete("/todos/{id}"){

            }
        }
    }.start(wait = true)
}

fun Application.module() {
    configureRouting()
}
