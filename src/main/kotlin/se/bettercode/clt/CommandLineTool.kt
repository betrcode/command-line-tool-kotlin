package se.bettercode.clt

import se.bettercode.clt.commands.CommandRegistry
import java.io.InputStream
import java.io.OutputStream
import java.io.PrintStream

/**
 * This is a basic command-line tool that can execute different commands.
 * Feel free to clone this and adapt it to your needs.
 */
class CommandLineTool(
    private val input: InputStream,
    private val output: OutputStream
) {

    fun run(args: Array<String>) {
        val printStream = PrintStream(output)

        if (args.isEmpty()) {
            printStream.println("No command provided. Use 'help' for a list of commands.")
            return
        }

        val commandName = args[0]
        val command = CommandRegistry.findByName(commandName)
            ?: throw IllegalArgumentException("Unknown command: $commandName")

        val commandArgs = args.drop(1)
        command.execute(commandArgs, input, printStream)
    }
}
