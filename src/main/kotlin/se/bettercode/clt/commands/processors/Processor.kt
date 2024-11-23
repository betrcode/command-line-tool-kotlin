package se.bettercode.clt.commands.processors

import java.io.PrintStream

interface Processor {
    fun commandName(): String
    fun description(): String
    fun processLine(line: String, output: PrintStream)
}
