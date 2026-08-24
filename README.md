# Java Assignment Exercises

This repository preserves a set of introductory Java exercises completed as part of an earlier software-development assignment. It is kept as a personal learning reference for revisiting core Java syntax and concepts rather than as a production application or portfolio project.

## Topics covered

### Core Java

- Abstract classes, interfaces, inheritance, and method overriding
- Encapsulation with getters and setters
- Creating threads by extending `Thread` and implementing `Runnable`
- Thread coordination with `join`
- Basic synchronized access to a shared object

### Collections

- Shuffling and iterating over lists
- Streams and enhanced `for` loops
- Case-insensitive `SortedSet` usage with a comparator
- Updating list elements with a `ListIterator`

### Java assessment exercises

- Iterating over `HashMap` and `ArrayList` collections
- Counting words with a map
- Finding duplicate characters in a string
- Finding the second-largest array value
- Finding repeated and non-repeated characters with streams

The `Docs` directory contains the original assignment and reference documents. The source code is grouped into three independent IntelliJ-era source trees: `Core Java`, `Collections`, and `Java Assessment`.

## Running an exercise

There is no Maven or Gradle build because these are standalone examples. Use JDK 8 or newer and compile an exercise from the relevant source directory. For example, from the repository root:

```powershell
Set-Location "Collections\src"
javac com\company\question1.java
java com.company.question1
```

Each source file has its own `main` method. Compile and run exercises individually using the package name declared in that file. Generated `.class` files and IDE-specific project files are intentionally excluded from version control.

## Repository status

This is a historical learning repository. It has no deployed service, external database, user data, credentials, or runtime dependencies. The examples favor clarity and preservation of the original assignments over production architecture.
