 My First Java Project

Hi! I'm learning Java from zero and building a real project step by step.
This repository is my learning journey.

## Main project: Expense Tracker

A console app where I can add expenses, see my total, and delete items.
The data is saved in a SQLite database.

## Roadmap

- [x] Stage 0: Set up Java, VS Code, Git and GitHub
- [x] Stage 1: Java basics (variables, if/else, loops, methods, classes)
- [x] Stage 2: Console expense tracker (add, list, delete, save to a file)
- [x] Stage 3: Add a database (SQL)
- [ ] Stage 4: Turn it into a web app with Spring Boot and user login
- [ ] Stage 5: Put it online so anyone can try it

## Features

- [x] Menu with a do-while loop
- [x] Add, view, total and delete expenses
- [x] Data saved in a SQLite database (`expenses.db`)
- [x] Java connects to the database with JDBC

## How to run

1. Install Java 21 (Temurin) and VS Code with the Extension Pack for Java.
2. Download the SQLite JDBC driver from Maven Central (`org.xerial:sqlite-jdbc`). I used version 3.53.4.0: the main `.jar` and the `natives-windows` `.jar`.
3. Create a folder called `lib` in the project and put the `.jar` files inside. They are not on GitHub, so everyone has to download them.
4. Run `Menu.java` and choose a number from the menu:
   1) Add expense, 2) View expenses, 3) Total, 4) Delete, 5) Exit
5. The file `expenses.db` is created automatically the first time you run it.

## What I'm learning

- Java fundamentals
- Git and GitHub
- SQL and JDBC
- Building a project step by step

## Tools

- Java 21 (Temurin)
- VS Code
- SQLite
- Git and GitHub

## Author

imane El mohmouh