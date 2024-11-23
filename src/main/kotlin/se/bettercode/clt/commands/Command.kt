package se.bettercode.clt.commands

import java.io.InputStream
import java.io.PrintStream

interface Command {
    val name: String
    val description: String

    fun execute(args: List<String>, input: InputStream, output: PrintStream)
}