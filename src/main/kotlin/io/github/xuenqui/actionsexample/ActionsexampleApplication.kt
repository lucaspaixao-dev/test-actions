package io.github.xuenqui.actionsexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ActionsexampleApplication

fun main(args: Array<String>) {
	runApplication<ActionsexampleApplication>(*args)
	print("olá github actions!")
}
