package com.example

import io.micronaut.runtime.Micronaut
import io.micronaut.runtime.Micronaut.run
object Application {
	@JvmStatic
	fun main(args: Array<String>) {
		Micronaut.build()
				.packages("example.micronaunt")
				.mainClass(Application.javaClass)
				.start()
	}
}

