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
    <td align="center"><strong>🟢 Start Screen</strong><br/><img src="<img width="575" height="1280" alt="image" src="https://github.com/user-attachments/assets/84b1dbf3-a66a-4592-92bf-077a665403b5" />
" width="200"/></td>
    <td align="center"><strong>🟡 Game Screen</strong><br/><img src="<img width="575" height="1280" alt="image" src="https://github.com/user-attachments/assets/28d6b152-c01a-47eb-8069-492d2ffbc9e8" />
" width="200"/></td>
    <td align="center"><strong>🟡 Navigation</strong><br/><img src="<img width="575" height="1280" alt="image" src="https://github.com/user-attachments/assets/f8a1d6ed-a17b-4a12-a401-933a4954ca31" />
" width="200"/></td>
    <td align="center"><strong>🔴 Victory!</strong><br/><img src="<img width="575" height="1280" alt="image" src="https://github.com/user-attachments/assets/1e7ac807-72f1-4bd8-b337-bce3c53fa292" />
" width="200"/></td>
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
