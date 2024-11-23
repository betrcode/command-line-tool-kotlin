package se.bettercode.clt.commands

import java.io.InputStream
import java.io.PrintStream

// Greet command
class GreetCommand : Command {
    override val name = "greet"
    override val description = "Greets a user"

    override fun execute(args: List<String>, input: InputStream, output: PrintStream) {
        if (args.isEmpty()) {
            output.println("Usage: greet <name>")
            return
        }

        val name = args[0]
        output.println("Hello, $name!")
    }
}
