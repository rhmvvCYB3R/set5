# 🧩 Maze Game (Android | Kotlin | Jetpack Compose)

> 🎯 A lightweight maze puzzle game built with Jetpack Compose  
> 🔥 Goal: reach the cell with value `0` to win

---

## 🎮 Core Concept

The maze is represented as a **2D integer grid**, where each cell encodes allowed movement using a **bitmask system**:

| Direction | Value |
|----------|------|
| Left     | 1    |
| Right    | 2    |
| Up       | 4    |
| Down     | 8    |
| Start    | 16   |

- Movement is restricted using bitmask rules  
- One-way paths are supported  
- Start position is detected automatically  
- Win condition triggers when player reaches value `0`

---

## ✨ Features

- 🏁 Start / Game / Result screens
- 🧠 Bitmask-based movement system
- 🚫 Safe boundary validation (no out-of-bounds movement)
- 🎮 Direction buttons with dynamic enabled/disabled state
- 📍 Automatic start position detection
- 🔁 Restart and menu navigation
- 🏆 Win condition based on reaching `0`

---

## 📸 Screenshots

### 🟢 Start Screen
<p align="center">
  <img src="https://github.com/user-attachments/assets/31602527-e801-472c-ba71-c0bc102677d0" width="250"/>
</p>

---

### 🟡 Game Screen (Maze Navigation)

<p align="center">
  <img src="https://github.com/user-attachments/assets/c0af72fa-fc30-4edf-825d-bcc2db89515f" width="250"/>
  <img src="https://github.com/user-attachments/assets/78e6daaa-1250-48f3-8674-ea33ec003d3d" width="250"/>
</p>

---

### 🔴 Result Screen (Win)

<p align="center">
  <img src="https://github.com/user-attachments/assets/7b034b8e-3376-4b56-8e6a-ff9323f637" width="250"/>
</p>

---

## 🗺 Maze Example

```kotlin
val maze = arrayOf(
    intArrayOf(10, 8, 10, 9),
    intArrayOf(28, 1, 0, 12),
    intArrayOf(12, 10, 9, 13),
    intArrayOf(6, 5, 6, 5)
)
