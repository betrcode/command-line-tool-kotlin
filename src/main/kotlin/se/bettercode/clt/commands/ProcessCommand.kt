package se.bettercode.clt.commands

import se.bettercode.clt.commands.processors.Processor
import java.io.InputStream
import java.io.PrintStream

class ProcessCommand(private val processor: Processor) : Command {
    override val name = processor.commandName()
    override val description = "Processes piped input. ${processor.description()}"

    override fun execute(args: List<String>, input: InputStream, output: PrintStream) {
        if (input.available() <= 0) {
            output.println("No piped input provided.")
            return
        }

        input.bufferedReader().useLines { lines ->
            lines.forEach { line ->
                processor.processLine(line, output)
            }
        }
    }
}
