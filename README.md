# 🏦 Bank Account Simulation – Java OOP Project

This project is developed as part of Task 5: Bank Account Simulation from the Elevate Labs Java Developer Internship program ✔️.
The goal was to simulate real-world banking operations using Object-Oriented Programming (OOP) concepts in Java, including inheritance, method overriding, encapsulation, and polymorphism.
The requirements and instructions were taken from the official internship task PDF. 

d9d3ded8-a3bf-4b0d-894a-c2da4d0…

📌 Objective of the Task

Build a console-based Bank Account Simulator

Create an Account class with methods for:

Deposit

Withdraw

Show balance

Maintain a transaction history

Use inheritance and method overriding

Implement a menu-driven system for user interaction

🧠 Concepts Used (as required in the task)
Concept	How I Implemented It
Class & Object	->Account, SavingsAccount, and BankApp classes created
Encapsulation ->	Account balance & data kept private and accessed through methods
Inheritance	-> SavingsAccount extends Account
Method Overriding ->	withdraw() method is overridden to enforce minimum balance logic
Polymorphism ->	Account ref = new SavingsAccount() usage in main
Constructor Overloading	-> Account initialization and object creation
Runtime Method Dispatch	Overridden ->method executed dynamically at runtime
User Input Handling	Scanner used for interactive CLI system
Real-World Simulation	Banking operations stored in a transaction list

All checklist points from the internship requirements were completed. ✔️

🛠 Tools & Technology Used

Programming Language: Java (JDK 21)

Editor: Visual Studio Code

Terminal/Shell: PowerShell / Command Prompt

Java Libraries: Scanner, ArrayList (no external dependencies)

Repository: Uploaded to GitHub as required

📂 Project File Structure

bank-account-simulation/
│
├── Account.java          → Base class with deposit, withdraw, history

├── SavingsAccount.java   → Child class (inheritance + overriding)

├── BankApp.java          → Main application with menu & user input

└── README.md

🚀 Features Implemented

Create account with default balance

Deposit funds

Withdraw funds with validation

Apply interest (Savings account only)

Prevent overdraft and maintain minimum balance rule

Show transaction history (audit log)

Display current balance anytime

Fully interactive console menu

▶️ How to Run the Program

1️⃣ Compile

javac *.java

2️⃣ Run
java BankApp


You will see this menu:

===== BANK ACCOUNT SIMULATION =====

1. Deposit
2. Withdraw
3. Check Balance
4. View Transaction History
5. Apply Interest
6. Exit

🧪 Testing & Validation

To ensure the program works properly, I tested:

Test	Result
Positive deposit	✔ Updated balance & saved transaction

Invalid deposit (negative)	✔ Error handled

Withdrawal with enough balance	✔ Successful

Withdrawal violating minimum balance rule	✔ Blocked with custom message

Transaction history logging	✔ Each action recorded

Program exit	✔ Closes safely
