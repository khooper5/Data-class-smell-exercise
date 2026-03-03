# Software Engineering – Data Class Smell Refactoring Exercise

## 🎯 Objective

This exercise is designed to help you:

- Understand the **Data Class (Anemic Class) smell**
- Use **PMD** to detect design problems
- Analyze object-oriented design quality
- Refactor code while preserving functionality

This is not just a tool exercise.  
The emphasis is on **design reasoning and improvement**.

---

## 📦 Application Overview

This repository contains a small Java console-based Order Management application.

The application is:

- Fully functional
- Runnable using Maven
- Intentionally designed with multiple **Data Class smells**

Your task is to detect and improve the design.

---

## 🧠 What Is a Data Class?

A Data Class is a class that:

- Contains mostly fields
- Has many getters and setters
- Has little or no behavior
- Delegates logic to other classes

This often results in an **Anemic Domain Model**, which violates object-oriented principles.

---

## 🛠 Student Workflow

### 1️⃣ Fork the Repository

Click **Fork** on GitHub to create your personal copy of this repository.

---

### 2️⃣ Clone Your Fork

Clone your fork into VS Code:


Git: Clone


---

### 3️⃣ Run PMD

From the root of the project, run:


mvn clean compile
mvn pmd:pmd


After execution, open:


target/site/pmd.html


Analyze the reported violations.

---

### 4️⃣ Analyze the Design

Identify:

- Which classes are Data Classes?
- Why are they considered anemic?
- Where is the behavior misplaced?
- Which object should actually own the logic?

---

### 5️⃣ Refactor the Code

Refactor the application to:

- Move behavior into appropriate classes
- Improve cohesion
- Improve encapsulation
- Reduce unnecessary getters/setters
- Follow object-oriented principles

Important:
- The application must remain fully functional
- The console output must remain correct

---

### 6️⃣ Verify Functionality

Rebuild the project:


mvn clean compile


Run the application and verify that the behavior is unchanged.

---

### 7️⃣ Submit Your Work

Open a **Pull Request (PR)** from your fork back to the original repository.

Your PR should contain:

- Refactored code
- Improved design
- No broken functionality

---


## ⚠ Important Notes

- Do not simply remove warnings without reasoning.
- Design improvement is more important than eliminating tool messages.
- Be prepared to explain your refactoring decisions.

---

## 📚 Learning Outcome

By completing this exercise, you should be able to:

- Recognize the Data Class smell
- Understand the consequences of an Anemic Domain Model
- Apply refactoring techniques to improve design
- Preserve behavior while restructuring code
- Use static analysis tools meaningfully

---
