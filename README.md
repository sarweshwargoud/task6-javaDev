# Bank Account Simulation (Java OOP)

This project simulates basic bank operations using Java and Object-Oriented Programming.  
It is part of the Elevate Labs Java Developer Internship – Task 5.

## Features
- Create a savings account with opening balance
- Deposit and withdraw money
- Maintain transaction history in memory
- Enforce minimum balance rule (SavingsAccount)
- Apply interest on savings
- Demonstrates:
  - Classes & Objects
  - Inheritance (SavingsAccount extends Account)
  - Method overriding (custom withdraw)
  - Runtime polymorphism (Account ref -> SavingsAccount object)

## How to Run

```bash
javac *.java
java BankApp
Files
Account.java – base account class with balance and transactions

SavingsAccount.java – child class with minimum balance & interest

BankApp.java – menu-driven console simulation
