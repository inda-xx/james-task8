![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-Uoscg5VjK7E0KYAUDLpFPrAM.png?st=2024-10-31T13%3A12%3A31Z&se=2024-10-31T15%3A12%3A31Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-10-31T01%3A04%3A36Z&ske=2024-11-01T01%3A04%3A36Z&sks=b&skv=2024-08-04&sig=CpmKbeXP9LHTG2Jpn4heOwUeyAOMJqoqh6CRqKcYO24%3D)

# 🎮 Simple Game Application: "Alien Escape"

Welcome to the "Alien Escape" project! In this task, you will create a simple game where players must navigate a spaceship through a field of aliens, collect points, and avoid enemy crafts. This project will enhance your understanding of object-oriented design, file I/O, and creative problem-solving.

## 🏆 Learning Goals

1. **Using Data from Files to Instantiate Objects**
    - Understanding file formats and parsing techniques.
    - Using file I/O classes for data extraction and object instantiation.
    - Handling exceptions and ensuring data integrity.

2. **Designing Classes**
    - Identifying class responsibilities and interfaces.
    - Implementing cohesive class structures.
    - Leveraging design patterns for class design.

3. **Programming Creatively**
    - Exploring problem-solving and algorithm design.
    - Encouraging experimentation and refinement.
    - Integrating user feedback for program improvement.

## 📝 Task Overview

You will build an interactive game application with the following features:
- Player movement
- Scoring system
- Enemy interactions

## 🚀 Exercises

### Exercise 1: File Formats & Parsing Techniques 📂

**Objective**: Grasp the theoretical aspects of using data from files for instantiation.

1. **Question**: Explain the differences between parsing a CSV file and a JSON file in Java.
2. **Task**: Research different libraries used for reading JSON and CSV files in Java. List the pros and cons of each.

### Exercise 2: Class Design Principles 🧩

**Objective**: Understand the theoretical foundations of effective class design.

1. **Question**: Describe the SOLID principles in class design and provide an example of a violation for each and how it can be corrected.
2. **Task**: Identify three common design patterns in Java that enhance class design and briefly explain their use cases.

### Exercise 3: Implementing File Reading for Game Objects 🚀

**Objective**: Apply file I/O to instantiate game objects.

1. **Task**: Create a `GameWorld` class that reads player and enemy data from text files `player.txt` and `enemies.txt`. Each line in the files represents an object with attributes like coordinates and speed.
   
   ```java
   public class GameWorld {
       private List<Player> players;
       private List<Enemy> enemies;
       
       public GameWorld(String playerFile, String enemyFile) {
           // Implement file reading and object instantiation
       }
   }
   ```

### Exercise 4: Designing Game Classes 🎮

**Objective**: Integrate class design principles by implementing cohesive game structures.

1. **Task**: Design the `Player` and `Enemy` classes based on the following specifications:
   - `Player`: Attributes include `xPos`, `yPos`, `score`. Methods for movement and scoring.
   - `Enemy`: Attributes include `xPos`, `yPos`, and `damage`. Methods for determining collisions with the player.

   ```java
   public class Player {
       private int xPos, yPos;
       private int score;

       // Constructors, getters, setters, movement, scoring methods
   }

   public class Enemy {
       private int xPos, yPos;
       private int damage;

       // Constructors, getters, setters, collision detection methods
   }
   ```

### Exercise 5: Building the Game Logic 🚀💥

**Objective**: Develop the game logic utilizing previous classes, expanding gameplay interaction and dynamics.

1. **Task**: Implement the game loop and interactions within the `GameWorld` class. Add methods `updateState` and `processInput`. Use these methods to check for player input and collisions between `Player` and `Enemy` objects.

   ```java
   public void updateState() {
       // Logic for updating the game state
   }

   public void processInput(String input) {
       // Handle player movements based on input data
   }
   ```

### Exercise 6: Creative Game Features 🤖✨

**Objective**: Explore creative extensions and improvements to the game, refining its design and increasing its complexity.

1. **Task**: Add features such as:
   - Power-ups that increase the player's score.
   - Different types of enemies with varied movement patterns.
   - A scoring system that also displays the player's highest score.

2. **Reflection**: Document what you learned throughout the project and any challenges you faced. Explore how the game could be improved or extended further.

### 🌟 Conclusion

By completing this task, you'll have developed a small-scale game application that combines object-oriented programming, file I/O, and creative coding practices. Reflect on your journey and consider how these skills can be applied to larger projects or different problem domains. Enjoy your game, and think about its further potential! Happy coding!