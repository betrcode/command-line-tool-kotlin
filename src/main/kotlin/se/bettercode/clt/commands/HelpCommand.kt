package se.bettercode.clt.commands

import java.io.InputStream
import java.io.PrintStream

class HelpCommand : Command {
    override val name = "help"
    override val description = "Lists available commands"

    override fun execute(args: List<String>, input: InputStream, output: PrintStream) {
        output.println("Available commands:")
        CommandRegistry.listCommands().forEach {
            output.println("  ${it.name} - ${it.description}")
        }
    }
}