# snap-project

## Snap Game
This Java console application simulates the classic Snap card game between two players. Players compete to spot matching cards and shout "SNAP!" to claim the match.

## Table of Contents
<li>Game Overview</li>
<li>Project Structure</li>
<li>How to Play</li>

## Game Overview
The Snap Game consists of two main components:

1. SnapGame class:
<ul>
  <li>Contains the main method to start the game.</li>
  <li>Manages the game loop, player interactions, and overall game state.</li>
</ul>

2. Player, Deck, and Card classes:
<ul>
  <li>Represent the players, deck of cards, and individual cards, respectively.</li>
  <li>Handle card-related operations, such as dealing cards, playing cards, and managing the game's state.</li>
  </ul>

## Project Structure
```
snap-game/
│
├── SnapGame2.java        # Main class to start the game
├── Player.java           # Class representing a player
├── Deck.java             # Class representing the deck of cards
├── Card.java             # Class representing an individual card
└── README.md             # Project documentation

```

## How to Play
1. Run the SnapGame2 class.
2. Follow on-screen instructions to start the game.
3. Players take turns playing cards.
4. Type 'snap' when you see a match or '0' to skip.
5. The game continues until one player runs out of cards.
6. The player with the most snaps wins.
