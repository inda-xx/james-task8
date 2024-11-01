# 🎮 Java Game Development Task: Simple Adventure

Welcome to your exciting journey into Java programming through game development! In this task, you will create a simple adventure game with core functionalities like player movement, scoring, and enemy interactions. This will be your playground to creatively apply file handling, class design, and creativity in programming.

## Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Understand file formats and parsing.
   - Use file I/O classes for reading data and converting it into object attributes.
   - Handle exceptions and ensure data integrity.

2. **Designing Classes**
   - Identify class responsibilities and define interfaces.
   - Implement cohesive class structures.
   - Leverage design patterns for enhanced designs.

3. **Programming Creatively**
   - Explore different problem-solving approaches.
   - Encourage iteration to refine solutions.
   - Integrate user feedback and testing.

---

## Task Overview
You will create a game application where a player navigates through a grid-based map, collects points, and interacts with enemies. This involves using data from files to setup the game environment, designing classes to manage game logic, and creatively implementing interactive features.

### Exercise 1: Understanding File Formats and Data Parsing 📄

**Objective**: Understand how to use files for game setup.

1. Describe different file formats (e.g., CSV, JSON) that could be used for storing game data like map layouts, player, and enemy settings.
2. Explain a method for parsing data from a chosen format in Java. Discuss how this data can be applied to instantiate game objects.

### Exercise 2: Designing Game Classes 🎨

**Objective**: Plan the class structure for your game.

1. Draw a UML diagram or write a detailed description of classes you will use (e.g., `Player`, `Enemy`, `GameMap`). Highlight their responsibilities and interactions.
2. Discuss how design patterns, such as the Singleton pattern for a game controller, can be applied to improve your design.

### Exercise 3: File Reading and Object Instantiation 📝

**Objective**: Implement file-based object creation.

Create a class `MapLoader` with the following elements:
- **Field**: `private List<GameTile> tiles;`
- **Constructor**: `public MapLoader(String filename)`
  - Use this constructor to read a file and instantiate `GameTile` objects that represent parts of the game world.

```java
public class MapLoader {
    private List<GameTile> tiles;

    public MapLoader(String filename) {
        // Logic to read from file and instantiate GameTile objects
    }

    public List<GameTile> getTiles() {
        return tiles;
    }
}
```

### Exercise 4: Implementing Class Interfaces and Methods 🧩

**Objective**: Build classes and their methods based on the design.

1. **Implement**: `Player` class with movement capabilities.
   - Methods: `move(Direction direction)` where `Direction` is an enum with values `UP`, `DOWN`, `LEFT`, `RIGHT`.
2. **Implement**: `Enemy` class with simple movement logic.
   - Methods: `moveTowards(int playerX, int playerY)` for basic pathfinding.

### Exercise 5: Scoring System and Collision Detection 🎯

**Objective**: Add gameplay mechanics and interactions.

1. Add a scoring system:
   - Implement a `Score` class to track and update the player's score.
   - Logic to increase score upon collecting items or defeating enemies.
   
2. Add collision detection:
   - Check for interactions between `Player` and `Enemy` objects.
   - Declare methods in both classes: `public boolean checkCollision(Enemy enemy)` and handle outcomes of collisions.

### Exercise 6: Creativity and User Feedback Loop 🌟

**Objective**: Enhance game play with creative features and feedback.

1. Implement a game loop in a `GameEngine` class that continuously updates and renders the game state based on user input.
   - Include methods to listen for and process key inputs.
   - Render graphical elements using a simple text-based interface or a library like JavaFX for more visual feedback.
   
2. Solicit feedback on usability and iterate over the design based on mock playtests or peer reviews.

---

### 📅 Submission Guidelines

- Your code should be well-documented and follow best coding practices.
- Include diagrams or pseudocode used during planning stages in your documentation.
- Ensure all classes and methods are tested thoroughly, and submit test cases alongside your implementation.

---

With this task, you will gain hands-on experience in Java file handling, class design, and creative programming, all while developing a fun, interactive game! Dive into this exciting challenge, and happy coding! 🎉