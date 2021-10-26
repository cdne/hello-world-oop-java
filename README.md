# Hello World OOP

## Story

Making friends in a new neighborhood is tough. First, learning all those
names, then saying hello to all of them!

[´Hello Janice!´](https://www.youtube.com/watch?v=FrBFfjdRGeA) ...doesn't it
sound better than 'Hello World!'?

## What are you going to learn?

- Set up your IDE of choice.
- Creating a new `class`.
- Instantiate and use `object`.
- `build` and `run`.
- Run your script from command line with arguments.

## Tasks

1. Create your own class in the project folder with name `App`, using the chosen IDE. Make sure that you create the class in the proper folder.
    - There is a new `App` class in the `com/codecool/helloworld/app` folder
    - The `App` is in the `com.codecool.helloworld.app` package.

2. Create a main method (entry point) in the `App` class, initialize your own instance of `HelloWorld` in the method, then call the welcome method of the instance. The app must pass its first command line argument to this method.
    - In class `App` there is a `main` method as the entry point of the program.
    - There is a `HelloWorld` instance created in the `main` method.
    - The `welcome` method in the `HelloWorld` instance is called with the first command line argument.

3. Compile your source files and run `App` with a command line argument using the terminal.
    - Class files are generated from source files.
    - Running the `App` from the terminal with a command line argument displays `Hello <argument>!` (for example, the argument `"Andrew"` prints `Hello Andrew!` to the output).

4. Write the commands used for compiling and running your program into the `make.sh` / `make.ps1` file. You can do both actions with one command. Make sure that you can run this file with a command line argument as well.
    - Previously used commands are saved in script file in separate lines.
    - Executing `make.sh` with an argument compiles the source code and calls `App` with the given argument, to perform the `Compile and run` task in one step.

5. Compile your source files and run `App` with a command line argument using your chosen IDE.
    - Class files are generated from source files.
    - Running the `App` from the IDE with a command line argument displays `Hello <argument>!` (for example, the argument `"Andrew"` prints `Hello Andrew!` to the output).

## General requirements

None

## Hints

- Set command line arguments (parameters) in your IDE. These settings are
  usually found in the project settings/configuration dialogs.
- Find out why running your `App` class without command line arguments results in an
  exception.


## Background materials

- <i class="far fa-exclamation"></i> [Open project in IntelliJ IDEA](project/curriculum/materials/pages/tools/open-project-in-intellij-idea.md)
- <i class="far fa-exclamation"></i> [How to compile and run Java](project/curriculum/materials/pages/java/how-to-compile-and-run-java.md)
- [Positional parameters in shell scripts](http://linuxcommand.org/lc3_wss0120.php)
- <i class="far fa-book-open"></i> [Introduction to shell scripting](https://www.guru99.com/introduction-to-shell-scripting.html)

