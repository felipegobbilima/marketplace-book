package com.marketplacebook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MarketplaceBookApplication

fun main(args: Array<String>) {
	runApplication<MarketplaceBookApplication>(*args)
}
