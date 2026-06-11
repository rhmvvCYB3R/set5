# 🧩 Maze Game (Android | Kotlin | Jetpack Compose)
---
## YOU WIN WHEN THE VALUE IS 0
## 🎮 Features

- Start / Game / Result screens
- Maze stored as a 2D integer array
- Bitmask-based movement system:
  - Left = 1
  - Right = 2
  - Up = 4
  - Down = 8
  - Start = 16
- Start position detected automatically
- One-way movement support
- Boundary validation (no out-of-bounds movement)
- Direction buttons with enabled/disabled state
- Win condition when reaching room value `0`
- Restart and Menu navigation

---

## 📸 Screenshots

### 🟢 Start Screen
<img src="<img width="575" height="1280" alt="image" src="https://github.com/user-attachments/assets/31602527-e801-472c-ba71-c0bc102677d0" />
" width="300"/>

---

### 🟡 Game Screen (Room View)
<img src="<img width="575" height="1280" alt="image" src="https://github.com/user-attachments/assets/c0af72fa-fc30-4edf-825d-bcc2db89515f" />
" width="300"/>

<img src="<img width="575" height="1280" alt="image" src="https://github.com/user-attachments/assets/78e6daaa-1250-48f3-8674-ea33ec003d3e" />
" width="300"/>

---

### 🔴 Result Screen (Win)
<img src="<img width="575" height="1280" alt="image" src="https://github.com/user-attachments/assets/7b034b8e-3376-4b56-8e6a-e9869323f637" />
" width="300"/>

---

## 🗺 Maze Example

```kotlin
val maze = arrayOf(
    intArrayOf(10, 8, 10, 9),
    intArrayOf(28, 1, 0, 12),
    intArrayOf(12, 10, 9, 13),
    intArrayOf(6, 5, 6, 5)
)
