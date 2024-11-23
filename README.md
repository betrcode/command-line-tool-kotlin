# Command Line Tool in Kotlin

A versatile command-line tool written in Kotlin, designed to handle various commands with extensibility and efficiency. 
This tool supports features like piped input processing, streaming large data, and modular command management.

Sometimes you just need to write a simple command-line tool to automate a task or process some data.
This project provides a starting point for building such a tool in Kotlin, with a few example commands to get you started.
When you want to write a slightly more complex command-line tool, this project can be a good foundation to build upon.
Bash is great, but not suitable for all tasks, and sometimes you need a more powerful tool to handle complex tasks.

## Features

- **Modular Commands**: Easily add new commands by implementing the `Command` interface.
- **Piped Input Support**: Process piped input efficiently using streaming.
- **Custom Processors**: Use or create processors for handling streamed input in different ways.
- **Memory Efficient**: Reads and processes large input data line-by-line.

---

## Commands

| Command             | Description                                    | Example Usage                                                   |
|---------------------|------------------------------------------------|-----------------------------------------------------------------|
| `help`              | Lists available commands.                      | `./command-line-tool help`                                      |
| `greet`             | Greets a user.                                 | `./command-line-tool greet Master Max`                          |
| `process-print`     | Processes piped input and just prints it back. | `echo "Hello, World!" \| ./command-line-tool process-print`     |
| `process-UPPERCASE` | Processes piped input and uppercases it.       | `echo "Hello, World!" \| ./command-line-tool process-UPPERCASE` |               

Additional commands can be added easily to extend functionality.

---

## Setup

### Prerequisites

- **Java 17+**
- **Kotlin 1.8+**
- **Maven** (for building the project)

### Clone the Repository

```bash
git clone https://github.com/<your-username>/command-line-tool-kotlin.git
cd command-line-tool-kotlin
```

### Build the Project

```bash
mvn clean package
```

## Usage

### Running the Tool

Use the bash script or batch file provided in the project root for easier execution.

**Example: Running help**
```bash
./command-line-tool help
```

**Example: Using greet**
```bash
./command-line-tool greet Master Max
```

**Example: Processing Piped Input**
```bash
echo -e "Hello\nWorld" | ./command-line-tool process-UPPERCASE
```

## Author

Max Wenzin, Crisp

Feel free to reach out for questions, suggestions, or feedback!

