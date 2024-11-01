![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-EawKEen7KM96jh5DlyNQLSrk.png?st=2024-11-01T14%3A07%3A52Z&se=2024-11-01T16%3A07%3A52Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-01T01%3A12%3A19Z&ske=2024-11-02T01%3A12%3A19Z&sks=b&skv=2024-08-04&sig=z/y2lShpllrqQH4GaKM3TqISjbJ1TWxiAwUXGfaC8no%3D)

**Task Title: Create a Simple Adventure Game**

Welcome to the Adventure Game challenge! In this task, you will design and implement a basic adventure game, incorporating various essential software development concepts. You will guide a player through a fictional world, collect points, and interact with enemies. This project will help you develop skills in reading data from files, designing classes, and creative programming. Let's get started!

---

**🎯 Learning Objectives:**

- **Using Data from Files to Instantiate Objects:**
  - Understand file formats and parsing techniques for data extraction.
  - Use file I/O classes to read data and convert it into object attributes.
  - Handle exceptions and ensure data integrity during object instantiation.

- **Designing Classes:**
  - Identify class responsibilities and define clear interfaces.
  - Implement cohesive class structures with appropriate fields and methods.
  - Leverage design patterns to solve common problems and enhance class design.

- **Programming Creatively:**
  - Explore different approaches to problem-solving and algorithm design.
  - Encourage experimentation and iteration to refine solutions.
  - Integrate user feedback and testing to improve program effectiveness and usability.

---

## 📝 Exercise 1: Understanding the Game Data

**Objective:** Begin by exploring the conceptual framework of using data from files to instantiate objects.

**Instructions:**

1. **Data Formats and Parsing:**
   - Discuss file formats (e.g., CSV, JSON) that can be used to store game data such as levels, player stats, and enemy attributes.
   - Describe techniques for parsing these files in Java.

2. **File I/O Basics:**
   - Explain the Java file I/O classes for reading data (e.g., `BufferedReader`, `FileReader`).
   - How does Java handle exceptions during file operations, and what strategies ensure data integrity?

*This exercise does not require coding but prepares you for the technical implementation ahead.*

---

## 📝 Exercise 2: Class Design Fundamentals

**Objective:** Focus on the theoretical aspects of designing game-related classes.

**Instructions:**

1. **Class Responsibilities and Interfaces:**
   - Identify potential responsibilities of classes like `Player`, `Enemy`, and `Game`.
   - Discuss how you'd define interfaces for these classes to interact seamlessly.

2. **Cohesive Class Design:**
   - What fields and methods would you include in a well-designed class structure?
   - Explain how design patterns such as Factory or Singleton could enhance the game's class design.

---

## 🕹️ Exercise 3: Reading Game Data (Coding)

**Objective:** Implement reading game configuration from a file.

**Instructions:**

1. **File Reader Class:**
   - Create a class `GameDataLoader` that reads enemy configurations from a file named `enemies.csv`.
   - Demonstrating file reading in Java, ensure you extract attributes like name, health, and attack power for each enemy.

```java
public class GameDataLoader {
    private List<Enemy> enemies;

    public GameDataLoader(String filename) {
        // Implement file reading and enemy instantiation
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}
```

2. **Exception Handling:**
   - Ensure your class handles exceptions gracefully, logging errors without crashing.

---

## 🚀 Exercise 4: Designing Core Classes (Coding)

**Objective:** Code the core classes based on your design from Exercise 2.

**Instructions:**

1. **Player and Enemy Classes:**
   - Design and implement the `Player` and `Enemy` classes.
   - Add appropriate fields (e.g., health, score, position) and methods (e.g., `move()`, `attack()`).

2. **Game Class Integration:**
   - Create a `Game` class that holds `Player` and a list of `Enemy` objects.
   - Implement the basic game loop handling player movement and enemy interactions.

```java
public class Game {
    private Player player;
    private List<Enemy> enemies;

    public Game(Player player, List<Enemy> enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    public void start() {
        // Implement game loop
    }
}
```

---

## 🔮 Exercise 5: Implementing the Scoring System (Advanced Coding)

**Objective:** Develop a scoring system and integrate it with game logic.

**Instructions:**

1. **Score Tracking:**
   - In the `Player` class, add a `score` attribute.
   - Implement methods to increase the score based on certain player actions or enemy defeats.

2. **Displaying Score:**
   - Modify the game loop to output the current score to the console after each player action.

3. **Testing and Feedback:**
   - Run the game and test the scoring system.
   - Document any bugs or peculiarities and iterate on your design.

---

## 🦸 Exercise 6: Enhancing the Game with Creative Interactions (Challenging)

**Objective:** Push the boundaries by introducing unique gameplay features.

**Instructions:**

1. **Creative Interactions:**
   - Introduce at least one creative interaction, such as a special item that doubles the player's score or an enemy with unique behavior.
   
2. **Refinement and User Interaction:**
   - Iterate over the game design, applying user feedback to improve playability.
   - Refactor your code for optimal performance and readability.

3. **Final Testing:**
   - Conduct extensive playthroughs to ensure all features work smoothly and the game is engaging.

---

Congratulations! By completing this task, you've not only developed a simple adventure game but also honed your skills in file I/O, class design, and creative programming. Keep experimenting and enhancing your game to discover what you can achieve! 🎮👾