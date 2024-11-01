package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private Player player1;
    private Player player2;
    private Enemy enemy1;
    private Enemy enemy2;
    private List<Player> players;
    private List<Enemy> enemies;
    private Game game;

    @Before
    public void setUp() {
        player1 = new Player("PlayerOne", 10, 0, 0, 100);
        player2 = new Player("PlayerTwo", 8, 1, 1, 100);
        enemy1 = new Enemy("Goblin", 0, 0, 20);
        enemy2 = new Enemy("Orc", 5, 5, 30);

        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        enemies = new ArrayList<>();
        enemies.add(enemy1);
        enemies.add(enemy2);

        game = new Game(players, enemies);
    }

    @Test(expected = NullPointerException.class)
    public void testGameConstructorHandlesNullPlayers() {
        new Game(null, enemies);
    }

    @Test(expected = NullPointerException.class)
    public void testGameConstructorHandlesNullEnemies() {
        new Game(players, null);
    }

    @Test
    public void testPlayerCollidesAndTakesDamage() {
        // Simulate a single game loop iteration
        player1.move(0, 0); // Ensuring collision
        enemy1.move(0, 0); // Ensuring collision
        game.start();

        // Player 1 should collide with the enemy and take damage.
        assertEquals(80, player1.getHealth());
        assertEquals(10, game.getScoreboard().getScore());
    }

    @Test
    public void testPlayerDoesNotCollideAndNoDamageIsTaken() {
        // Simulate a single game loop iteration where no collisions occur
        enemy1.move(10, 10); // Move enemy away from player
        game.start();
        
        // Player 1 should not collide with the enemy, so no damage is taken
        assertEquals(100, player1.getHealth());
        assertEquals(0, game.getScoreboard().getScore());
    }

    @Test
    public void testPlayerDefeated() {
        enemy1 = new Enemy("Dragon", 0, 0, 100); // Stronger enemy
        enemies.set(0, enemy1); // Replace enemy in the list
        game = new Game(players, enemies);
        game.start();
        
        // Player 1 should be defeated
        assertTrue(player1.getHealth() <= 0);
    }

    @Test
    public void testScoreboardUpdatesCorrectly() {
        // Simulate a game loop with a known scoring result
        player1.move(0, 0); // Ensuring collision
        player2.move(0, 0); // Ensuring collision
        enemy1.move(0, 0); // Ensuring player 1 collides
        enemy2 = new Enemy("Orc", 1, 1, 5); // Ensuring player 2 collides
        enemies.set(1, enemy2);
        game = new Game(players, enemies);
        game.start();

        // Both players should collide and update the score twice
        assertEquals(20, game.getScoreboard().getScore());
    }

    @Test
    public void testEnemyMovementAffectsCollision() {
        // Enemy 1 moves away, player should not collide
        enemy1.move(10, 10);
        enemy2 = new Enemy("Orc", 0, 0, 5); // Ensuring enemy 2 collides with player 1
        enemies.set(1, enemy2);

        game = new Game(players, enemies);
        game.start();

        // Player 1 should take damage from enemy 2 only
        assertEquals(95, player1.getHealth());
        assertEquals(10, game.getScoreboard().getScore());
    }

    @Test
    public void testGameDoesNotStartWithEmptyPlayerList() {
        Game emptyPlayerGame = new Game(new ArrayList<>(), enemies);
        emptyPlayerGame.start();
        // Assert the game does not proceed without any players
        assertEquals(0, emptyPlayerGame.getScoreboard().getScore());
    }

    @Test
    public void testGameDoesNotStartWithEmptyEnemyList() {
        Game emptyEnemyGame = new Game(players, new ArrayList<>());
        emptyEnemyGame.start();
        // Assert the game does not proceed without any enemies
        assertEquals(0, emptyEnemyGame.getScoreboard().getScore());
    }
}

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

