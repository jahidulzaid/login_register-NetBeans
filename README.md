# Project Name

Implementation of Login-signup in NetBeans using Java swing with MySQL Database Connection.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project aims to provide a simple and intuitive login and signup system for users. It utilizes Java Swing for building the GUI components such as text fields, buttons, and labels. The backend logic handles user authentication and registration, with data stored in a MySQL database.

## Features

User Authentication: Users can log in with their username and password.
User Registration: New users can sign up by providing necessary information.
MySQL Database Connection: Utilizes MySQL for storing user credentials securely.
GUI Interface: Provides a user-friendly graphical interface built with Java Swing.

## Installation

To run the project locally, follow these steps:

1. Clone the repository:

[git clone https://github.com/username/project-name.git](https://github.com/jahidulzaid/login_register-NetBeans.git)


1. Open the project in NetBeans IDE.
2. Set up the MySQL database:
   1. Create a MySQL database named `login_signup`.
   2. Import the provided SQL script (`database.sql`) to create the necessary tables.
3. Configure the database connection:
   1. Open the `DBConnection.java` file.
   2. Update the database URL, username, and password with your MySQL credentials.
4. Build the project to resolve dependencies.
5. Run the project to launch the application.


## Usage
1. Launch the application.

2. Choose between logging in with an existing account or signing up for a new one.

3. For signup:
   1. Enter the required information (username, password, etc.).
   2. Click on the signup button to create a new account.

4. For login:
   1. Enter your email and password.
   2. Click on the login button to access the system.

## Contributing

Contributions are welcome! Here's how you can contribute to the project:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.
