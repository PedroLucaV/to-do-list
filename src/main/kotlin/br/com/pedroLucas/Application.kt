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
            get("/afazeres"){

            }
            get("/afazeres/{id}"){

            }

            post("/afazeres"){

            }

            put("/afazeres/{id}"){

            }

            delete("/afazeres/{id}"){

            }
        }
    }.start(wait = true)
}

fun Application.module() {
    configureRouting()
}
