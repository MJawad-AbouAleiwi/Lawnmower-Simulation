# Lawnmower Simulation

This project simulates the movement of automatic lawnmowers on a grid-based lawn using commands.  

---

## Problem Description

The lawn is a rectangle defined by coordinates where:

- Lower-left corner is always `(0,0)`
- Upper-right corner is provided in the input file

Each mower has:

- A starting position `(x, y)`
- An orientation `N`, `E`, `S`, or `W`
- A sequence of commands:
  - `G` → turn left
  - `D` → turn right
  - `A` → move forward

Mowers operate **one after another**, not simultaneously.  
Attempts to move outside the lawn are ignored.

---

## Class Structure

### `Lawn`
Represents the lawn boundaries and checks valid positions.

### `Mower`
Stores a mower’s position and orientation and contains movement logic.

### `CommandProcessor`
Executes a list of instructions on a mower object.

### `Main`
Program entry point. Reads input, creates objects, runs the simulation, prints results.

---

## Project Structure

```
Lawnmower-Simulation/
├── src/
│   ├── Main.java
│   ├── Lawn.java
│   ├── Mower.java
│   └── CommandProcessor.java
├── input.txt
└── README.md
```

---

## Running the Program

### 1. Compile

```bash
javac *.java
```

### 2. Run

```bash
java Main
```