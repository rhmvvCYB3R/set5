<p align="center">
  <img src="https://github.com/user-attachments/assets/31602527-e801-472c-ba71-c0bc102677d0" width="120"/>
</p>

<h1 align="center">🧩 Maze Game</h1>
<p align="center">
  <strong>Android · Kotlin · Jetpack Compose</strong><br/>
  A lightweight maze puzzle game with bitmask-based movement system
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-1.9.0-purple?logo=kotlin"/>
  <img src="https://img.shields.io/badge/Jetpack%20Compose-2024.02.00-blue"/>
  <img src="https://img.shields.io/badge/Android-5.0+-green"/>
  <img src="https://img.shields.io/badge/License-MIT-yellow"/>
</p>

---

## 🎮 Game Concept

The maze is represented as a **2D integer grid**, where each cell encodes allowed movement using a **bitmask system**:

| Direction | Value |
|-----------|-------|
| ← Left    | `1`   |
| → Right   | `2`   |
| ↑ Up      | `4`   |
| ↓ Down    | `8`   |
| 🟢 Start  | `16`  |


---

## 📸 Screenshots

<table align="center">
  <tr>
    <td align="center"><strong>🟢 Start Screen</strong><br/><img src="https://github.com/user-attachments/assets/31602527-e801-472c-ba71-c0bc102677d0" width="200"/></td>
    <td align="center"><strong>🟡 Game Screen</strong><br/><img src="https://github.com/user-attachments/assets/c0af72fa-fc30-4edf-825d-bcc2db89515f" width="200"/></td>
    <td align="center"><strong>🟡 Navigation</strong><br/><img src="https://github.com/user-attachments/assets/78e6daaa-1250-48f3-8674-ea33ec003d3d" width="200"/></td>
    <td align="center"><strong>🔴 Victory!</strong><br/><img src="https://github.com/user-attachments/assets/7b034b8e-3376-4b56-8e6a-ff9323f637" width="200"/></td>
  </tr>
</table>

---

## 🗺️ Maze Example

```kotlin
val maze = arrayOf(
    intArrayOf(10, 8, 10, 9),
    intArrayOf(28, 1, 0, 12),
    intArrayOf(12, 10, 9, 13),
    intArrayOf(6, 5, 6, 5)
)
