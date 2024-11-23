package se.bettercode.clt.commands

import se.bettercode.clt.commands.processors.PrintProcessor
import se.bettercode.clt.commands.processors.UpperCaseProcessor

object CommandRegistry {
    private val commands: List<Command> = listOf(
        HelpCommand(),
        GreetCommand(),
        ProcessCommand(PrintProcessor()),
        ProcessCommand(UpperCaseProcessor())
    )

    fun findByName(name: String): Command? {
        return commands.find { it.name.equals(name, ignoreCase = true) }
    }

    fun listCommands(): List<Command> {
        return commands
    }

}
