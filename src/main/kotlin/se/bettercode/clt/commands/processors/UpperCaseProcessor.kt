package se.bettercode.clt.commands.processors

import java.io.PrintStream

class UpperCaseProcessor : Processor {
    override fun commandName(): String {
        return "process-UPPERCASE"
    }

    override fun description(): String {
        return "Converts each line to uppercase"
    }

    override fun processLine(line: String, output: PrintStream) {
        output.println(line.uppercase())
    }
}
