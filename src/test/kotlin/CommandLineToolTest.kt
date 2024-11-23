import org.junit.jupiter.api.Test
import se.bettercode.clt.CommandLineTool
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class CommandLineToolTest {

    @Test
    fun `test help command`() {
        val input = ByteArrayInputStream(ByteArray(0))
        val output = ByteArrayOutputStream()

        val cli = CommandLineTool(input, output)
        cli.run(arrayOf("help"))

        val result = output.toString().trim()
        assertTrue(result.contains("Available commands"))
        assertTrue(result.contains("help"))
        assertTrue(result.contains("greet"))
    }

    @Test
    fun `test greet command`() {
        val input = ByteArrayInputStream(ByteArray(0))
        val output = ByteArrayOutputStream()

        val cli = CommandLineTool(input, output)
        cli.run(arrayOf("greet", "Master Max"))

        val result = output.toString().trim()
        assertEquals("Hello, Master Max!", result)
    }

    @Test
    fun `test unknown command`() {
        val input = ByteArrayInputStream(ByteArray(0))
        val output = ByteArrayOutputStream()

        val cli = CommandLineTool(input, output)

        val exception = assertFailsWith<IllegalArgumentException> {
            cli.run(arrayOf("unknown"))
        }
        assertEquals("Unknown command: unknown", exception.message)
    }
}
