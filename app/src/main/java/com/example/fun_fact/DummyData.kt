package com.example.fun_fact

object DummyData {
    val funFacts = listOf(
        FactModel(
            name = "Kotlin",
            R.drawable.kotlin_logo,
            fact = "Kotlin is a general purpose, free, open source, statically typed “pragmatic” programming language initially designed for the JVM (Java Virtual Machine) and Android that combines object-oriented and functional programming features. It is focused on interoperability, safety, clarity, and tooling support."
        ),

        FactModel(
            name = "Java",
            R.drawable.java_logo,
            fact = "Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. ... Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. "
        ),

        FactModel(
            name = "Python",
            R.drawable.python_logo,
            fact = "Python is a multi-paradigm programming language. Object-oriented programming and structured programming are fully supported "
        ),

        FactModel(
            name = "JavaScript",
            R.drawable.javascript_logo,
            fact = "JavaScript® (often shortened to JS) is a lightweight, interpreted, object-oriented language with first-class functions, and is best known as the scripting language for Web pages, but it's used in many non-browser environments as well "
        ),

        FactModel(
            name = "PHP",
            R.drawable.php_logo,
            fact = "PHP is an acronym for \"PHP: Hypertext Preprocessor\" · PHP is a widely-used, open source scripting language"
        )

    )
}