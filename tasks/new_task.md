## 🎮 Simple Game Application Task

In this task, you will create a simple game application that includes player movement, a scoring system, and enemy interactions. The game will load initial configurations and player details from files, instantiate objects, and provide an interactive gaming experience. Through this task, you will employ object-oriented design, utilize file input/output for dynamic data handling, and creatively program gameplay functionality. 

### Learning Goals

1. **📂 Using Data from Files to Instantiate Objects**
   - Extract and understand different file formats and parsing techniques.
   - Use file I/O classes to read data and convert it into object attributes.
   - Handle exceptions and ensure data integrity during object instantiation.

2. **🏗️ Designing Classes**
   - Identify class responsibilities and define clear interfaces.
   - Implement cohesive class structures with appropriate fields and methods.
   - Leverage design patterns to solve common problems and enhance class designs.

3. **🎨 Programming Creatively**
   - Explore different approaches to problem-solving and algorithm design.
   - Encourage experimentation and iteration to refine solutions.
   - Integrate user feedback and testing to improve program effectiveness and usability.

---

### Exercise 1 & 2: Theoretical Foundations

#### Exercise 1: 📜 Understanding File Formats and Parsing Techniques

**Objective:** Deepen your understanding of file I/O by exploring different formats and parsing techniques. 

**Tasks:**

- Research common file formats used for storing game data (e.g., JSON, CSV, XML).
- Discuss the advantages and disadvantages of different file formats regarding data storage and retrieval in game applications.
- Explain parsing techniques for reading these file formats in Java. Provide pseudocode or flow diagrams to illustrate the parsing process.

#### Exercise 2: 📘 Class Design Principles

**Objective:** Strengthen your grasp of OOP by exploring class design principles.

**Tasks:**

- Describe the role of a game entity class and what responsibilities it might have in your game design.
- Draft an interface for the player and enemy entities, outlining class responsibilities and required methods.
- Discuss how the SOLID principles apply to your class design, making your game scalable and maintainable.

---

### Exercise 3 & 4: Practical Implementation

#### Exercise 3: 📂 File I/O and Object Instantiation

**Objective:** Implement file reading and utilize it to set up game objects.

**Tasks:**

- Create a class `GameConfigLoader` that reads configuration data (initial positions, speeds, etc.) from a file.
- Implement methods in `GameConfigLoader` to parse this data and create instances of player and enemy objects.
  ```java
  public class GameConfigLoader {
      public List<GameObject> loadConfig(String filename) {
          // Placeholder: Return a list of objects based on file data.
      }
  }
  ```
- Ensure your implementation handles exceptions and maintains data integrity.

#### Exercise 4: 🏃‍♂️ Player Movement and Interaction

**Objective:** Develop player movement mechanics and basic interactions.

**Tasks:**

- Design a `Player` class incorporating movement logic (e.g., using keyboard inputs).
  ```java
  public class Player {
      // Fields and methods for player movement
      public void moveLeft() { /*...*/ }
      public void moveRight() { /*...*/ }
  }
  ```
- Allow players to interact with the game world (e.g., collect items, adjust score).

---

### Exercise 5 & 6: Advanced Challenges

#### Exercise 5: 🎯 Implementing a Scoring System and Enemy Interactions

**Objective:** Enhance game logic with a scoring system and dynamic enemy behaviors.

**Tasks:**

- Develop a `ScoreManager` class to track and update the player’s score throughout the game.
  ```java
  public class ScoreManager {
      private int score;
      public void addPoints(int points) { /*...*/ }
  }
  ```
- Create an `Enemy` class where enemies have behaviors that interact with the player (e.g., following, avoiding).
- Ensure smooth integration between player-enemy interactions and how they affect the scoring system.

#### Exercise 6: 🛠️ Creative Game Feature Development

**Objective:** Extend the game by integrating creative features for a more dynamic gameplay experience.

**Tasks:**

- Introduce power-ups or special items that can be collected by players, affecting their abilities or score.
- Implement simple AI for enemies, adding unpredictability to their behavior patterns.
- Use user feedback to adjust difficulty levels, refine movement mechanics, and enhance features.

---

### 📑 Submission Guidelines

Ensure your code is well-documented with comments explaining your logic. Test extensively to verify that each part of your game functions as intended. Include a README with instructions explaining how to set up and run your game. Be prepared to demonstrate your game in class or a live session.

Good luck, and have fun creating your game! 🚀