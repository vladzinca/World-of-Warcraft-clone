# World of Warcraft Clone

## 👹 What is it?

This is a Java program that simulates game features loosely based on [World of Warcraft](https://en.wikipedia.org/wiki/World_of_Warcraft), and puts them all together in a text adventure game.

The game classes use various OOP concepts such as inheritance, abstraction and encapsulation to work together.

It was one of the first bigger projects I have attempted, and one that I have never put into place completely.

## 🔧 How to run it?

1.  Clone this repository.
2.  Use an IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows) to run different `<feature>Test.java` files.
3.  Enjoy!

## 👸 What does it do?

I will try to explain every present class and its functionality.

### 🔐 Account

This class contains information about the player, all their characters and the number of games they play. What's also of note is that it uses a **Builder** design pattern.

### 🔑 Credentials

This class stores emails and passwords.

### 📜 Grid

This class models a game table, which is envisioned as a grid. It stores the length and width of the table, the current position of a character, a method to generate the map with at least 4 stores and 4 enemies, and 4 methods of table traversal called `goNorth()`, `goSouth()`, `goWest()` and `goEast()`.

### 🟩 Cell

This class modelates one space unit on the game table, and it stores the coordinates of the cell, the type of cell (which can either be `EMPTY`, `ENEMY`, `SHOP` or `FINISH`), and whether the cell has been visited in the past or not.

### 🧝🏼‍ Entity

This is an **abstract class** that contains an ability list, the current and maximum health, the current and maximum stamina, protections against the elements and methods for health and mana regeneration, for using an ability, a method to receive damage and, last but not least, a method to calculate the damage.

### 🧞 Character

This is an **abstract class** that **extends** Entity and contains the name of the character, its coordinates, an Inventory object, current XP, current level, character's strength, charisma and dexterity, and a method to buy potions, if there exists enough money and invetory space. Also relevant is that this class uses the **Factory** design pattern.

### 🧙🏼 Warrior, Mage & Rogue

These three classes **extend** Character and implement a special way to receive damage based on unique class abilties, as well as the class of the enemy they interact with.

### 🏹 Spell

This **abstract class** dictates how each spell must have both a damage value, as well as a mana value that has to be deduced from the entity that casts it.

### 🔥 Ice, Fire & Earth

These three classes **extend** Spell and model how each spell type works.

### 🐲 Enemy

This class **extends** Entity and generates new, random enemies using `Math.random()`.

### 💰 Inventory

This class creates the inventory, that is imagined as a potions list, a maximum weight value, a number of coins, and three methods to work on said values, that is adding a potion, removing a potion and calculating the weight that a character can still carry.

### ⚗️ Potion

This is an **interface** that dictates what a potion can do through methods describing the potion type and how it can affect a character through its price, regeneration value and weight.

### 🧪 HealthPotion & ManaPotion

These two classes **implement** the special values particular to each potion type.

### 🏰 Shop

This class generates a shop with 2-4 random potions, as well as the ability to select a certain potion from the shop and return it.

### 🎲 Game

This class generates a game instance, using the **Singleton** design pattern.

## 🎓 What did I learn?

Simply put: more that I could handle at the time. Writing something like this from scratch, integrating OOP concepts with design patterns like Singleton, Factory and Builder felt challenging, and having worked at this project will surely serve me a lot on my path to becoming a software developer.

Something else I learned is the ambiguity that could be characteristic of a project's expectations. Before this project, most of the programs that I developed were simple, precise, input-to-output algorithms, where you are given an input and you're expected an output.

But more often than not, a developer is not thrown a concrete app plan, but an ambiguous idea that he must turn into reality using their own creativity: that is, in my opinion, the beauty of this craft!

## 🤔 Did you know?

Back in January 2022, I was just beginning to grasp how real world projects and apps are made. And this program, with 43 Java files available in `src/`, felt really, really huge.
