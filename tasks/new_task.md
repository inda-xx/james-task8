# 🎮 Game Development Task: Building a Simple Adventure Game

In this task, you will design and implement a simple text-based adventure game. Your game will involve player movement, a basic scoring system, and interactions with enemies. This exercise will help you integrate files for data handling, class design, and creative programming techniques. We'll proceed through a series of exercises that explore these concepts and result in a functional game by the end.

## Instruction Overview

Your task is divided into six exercises, gradually increasing in complexity. By the end of this task, you'll develop:

- A player character with movement capabilities.
- A dynamic world instantiated from file data.
- An enemy system that interacts with the player.
- A scoring mechanism to reflect player progression.

### Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Understand file formats and parsing techniques.
   - Implement file I/O operations for object instantiation.
   - Handle exceptions and ensure object integrity.

2. **Designing Classes**
   - Identify responsibilities and define class interfaces.
   - Implement cohesive class structures.
   - Use design patterns where applicable.

3. **Programming Creatively**
   - Explore creative problem-solving and algorithm design.
   - Encourage experimentation and iterative development.
   - Integrate user feedback and testing processes.

---

## Exercise 1: 📄 Understanding File-based Object Initialization

**Objective:** Comprehend how game data can be structured in files and used to initialize game objects.

**Task:** Describe how data files can be used to create game objects. Consider player statistics, game world setup, enemy types, etc. Discuss file formats and parsing methods appropriate for game data, such as CSV, JSON, or XML.

**Deliverable:** Write a short essay (200-300 words) on the topic, citing any external resources or examples you've examined.

---

## Exercise 2: 📦 Class Design Fundamentals

**Objective:** Conceptualize the key classes for a simple game, defining their responsibilities and interactions.

**Task:** Sketch out the class designs for your game. Identify at least three classes (e.g., `Player`, `Enemy`, `GameWorld`) and describe their primary methods and attributes, ensuring responsibilities are clearly defined.

**Deliverable:** Provide a UML diagram or a written description of your class architecture, explaining each class's role in the game.

---

## Exercise 3: 📜 Code the Player and Game World

**Objective:** Implement fundamental classes using data from a file.

**Task:** 

1. Create the `Player` class, with attributes for position, score, and health.
2. Implement a `GameWorld` class that initializes with data from a file, creating terrain and object placements.

**Instructions:**

- Create a file (e.g., `world.txt`) detailing your world layout.
- Read and parse this file in your `GameWorld` class constructor.

```java
public class GameWorld {
    private List<Object> gameObjects;

    public GameWorld(String filename) {
        // Use BufferedReader to read 'world.txt' and initialize objects
    }
}
```

**Deliverable:** Implement the classes, ensuring the `Player` can be positioned and the world is initialized from the file.

---

## Exercise 4: 🛡️ Implement Basic Enemy Interactions

**Objective:** Add enemies to your game and implement foundational interaction mechanics.

**Task:** 

1. Create an `Enemy` class, with attributes for position and behavior.
2. Implement basic interaction logic where the player 'engages' with enemies, impacting health or score.

**Instructions:**

- Use file data to instantiate enemies, parsing their initial positions and types.
- Implement a simple method in `Player` to handle interactions:

```java
public void engageWithEnemy(Enemy enemy) {
    // Logic to handle player-enemy interaction
}
```

**Deliverable:** Ensure your game has at least two enemy types and the player can interact with them, altering the game state.

---

## Exercise 5: 💻 Enhance with Movement and Scoring Systems

**Objective:** Develop dynamic game mechanics including player movement and a scoring system.

**Task:**

1. Implement player movement, allowing navigation in all four cardinal directions.
2. Design a scoring mechanism that increments based on player actions (e.g., defeating enemies).

**Instructions:**

- Add methods in `Player` for movement:

```java
public void move(Direction direction) {
    // Update player position based on direction
}
```

- Create a `score` attribute and related methods for the `Player` class to adjust scoring based on interactions.

**Deliverable:** Implement a tested player movement system and ensure the score updates correctly via interactions.

---

## Exercise 6: 🎯 Finalize with Creative Extensions

**Objective:** Add creative elements or polish existing features to enhance gameplay and user experience.

**Task:** 

Extend your basic game with at least two of the following features:

1. Power-ups that modify player attributes.
2. Environmental obstacles influencing movement.
3. A narrative element guiding player decisions.
4. A simple graphical representation of the game state (e.g., ASCII art).

**Instructions:**

- Choose enhancements that match your interests and technical skill level.
- Encourage user testing and refinement based on player feedback.

**Deliverable:** Provide documentation of your enhancements, along with an explanation of your design decisions.

---

By the end of these exercises, you’ll have a working, albeit simple, adventure game. Use this task not only to practice Java programming concepts but also to explore creative game design. Have fun building your game! 🎮👾