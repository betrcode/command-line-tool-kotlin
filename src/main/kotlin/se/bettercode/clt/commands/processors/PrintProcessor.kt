package se.bettercode.clt.commands.processors

import java.io.PrintStream

class PrintProcessor : Processor {
    override fun commandName(): String {
        return "process-print"
    }

    override fun description(): String {
        return "Prints each line as is"
    }

    override fun processLine(line: String, output: PrintStream) {
        output.println(line)
    }
}
