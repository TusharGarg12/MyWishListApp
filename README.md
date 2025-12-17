📝 MyWishList App

MyWishList App is a clean, modern Android application designed to help users track their desires and shopping goals. Built with Jetpack Compose and Room Database, it offers a seamless offline-first experience for managing items you want to buy or achieve.

✨ Features

Create & Manage: Easily add new items with titles and descriptions.

Edit & Update: Modify existing wishes as your plans change.

Delete: Remove items you've acquired or no longer need.

Offline Storage: All data is persisted locally using Room Database, ensuring access without an internet connection.

Modern UI: A sleek, reactive user interface built with Material 3 Design components.

🛠️ Tech Stack

Language: Kotlin

UI Framework: Jetpack Compose (Material 3)

Architecture: MVVM (Model-View-ViewModel)

Local Database: Room Persistence Library

Dependency Injection: Hilt (Optional - remove if not used)

Asynchronous: Kotlin Coroutines & Flow


🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

Prerequisites

Android Studio (Hedgehog or newer recommended)

JDK 17 or higher

A physical Android device or Emulator (API Level 26+)

Installation

Clone the repository

git clone [https://github.com/TusharGarg12/MyWishListApp.git](https://github.com/TusharGarg12/MyWishListApp.git)


Open in Android Studio

Launch Android Studio -> File -> Open -> Select the cloned folder.

Sync Dependencies

Let Gradle build the project and download necessary libraries.

Run the App

Select your device and click the Run (Play) button.

📂 Project Structure

com.example.mywishlistapp
├── data
│   ├── Wish.kt           // Data Model
│   ├── WishDao.kt        // Database Access Object
│   └── WishDatabase.kt   // Room Database Instance
├── ui
│   ├── theme             // Compose Theme & Color
│   ├── HomeView.kt       // Main List Screen
│   ├── AddEditDetailView.kt // Form Screen
│   └── WishViewModel.kt  // Logic & State Holder
├── Graph.kt              // Dependency Injection / Service Locator
└── MainActivity.kt       // Entry Point


🔮 Future Improvements

[ ] Add categories/tags for wishes.

[ ] Integration with online shopping links.

[ ] Cloud sync (Firebase) for multi-device support.

[ ] Dark Mode toggle.

🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

📞 Contact

Tushar Garg

GitHub

LinkedIn
