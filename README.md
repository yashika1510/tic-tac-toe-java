# **🕹️ Tic-Tac-Toe Game (Java Swing)**

This is a simple Tic-Tac-Toe game built using Java Swing with a clean, modular design. It provides a graphical user interface (GUI) where two players can take turns marking "X" and "O" on a 3x3 grid.

### **🚀 Features**

* 🎨 Graphical UI using Swing
* 👥 Two-player mode
* 🏆 Win detection for rows, columns, and diagonals
* 🔄 Replay option after each game
* ✅ Encapsulated game logic for easy modifications
* 🔧 Java 8+ stream-based optimizations

### **📁 Project Structure**

* 📦 com.tictactoe
* ┣ 📂 logic
* ┃ ┗ 🏗 TicTacToeGameLogic.java         -> Manages board state, turns, and win conditions
* ┣ 📂 listener
* ┃ ┗ 🎮 TicTacToeButtonListener.java    -> Handles button clicks and gameplay interactions
* ┣ 📂 ui
* ┃ ┗ 🖥️ TicTacToeUI.java        -> Renders game UI, handles resets & results
* ┗ 📜 README.md                -> Project documentation

### **🛠️ Installation & Setup**

#### Prerequisites
* Java 8+ installed
* IDE (IntelliJ, Eclipse, VS Code) or Command Line

#### Steps to Run

##### Option 1: Running the Executable JAR File

If you don't want to manually compile the project, you can run the game directly from the tic-tac-toe-java.jar file.

Download the JAR file: If you have the JAR file locally, you can simply run it using the following command:

java -jar tic-tac-toe-java.jar

##### Option 2: Running from Source Code
###### 1. Clone the repository:
git clone https://github.com/yashika1510/tic-tac-toe-java.git

cd tic-tac-toe-java

###### 2. Compile the project:
javac -d out -sourcepath src src/com/tictactoe/ui/TicTacToeUI.java

###### 3. Run the game:
java -cp out com.tictactoe.ui.TicTacToeUI

### 🏗️ Code Overview

* TicTacToeGameLogic.java → Handles board state, win conditions, and turn switching.
* TicTacToeButtonListener.java → Listens for button clicks, updates UI, and interacts with game logic.
* TicTacToeUI.java → Manages UI rendering, resets, and game interactions.

### 📜 License

This project is open-source. Feel free to modify and improve it!

Made with ❤️ by Yashika Malhotra
