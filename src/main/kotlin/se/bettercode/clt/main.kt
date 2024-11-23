package se.bettercode.clt

import kotlin.system.exitProcess

// Main entry point for the CLI
fun main(args: Array<String>) {
    val cli = CommandLineTool(System.`in`, System.out)
    try {
        cli.run(args)
    } catch (e: IllegalArgumentException) {
        System.err.println("Error: ${e.message}")
        exitProcess(1)
    }
}

