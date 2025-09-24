AI ChatBot

An intelligent AI-powered chatbot web application built with React.js frontend and Spring Boot backend using Google Gemini API for natural language processing. This chatbot allows users to interact with an AI, get responses in real-time, and manage conversations seamlessly.

Table of Contents

Features

Technologies Used

Demo

Installation

Usage

API Integration

Folder Structure

Future Improvements

License

Features

Real-time chat with AI using Gemini API

Dynamic frontend built with React.js

Secure backend using Spring Boot

Support for multiple user sessions

Message history stored and managed efficiently

Responsive UI for desktop and mobile devices

Technologies Used

Frontend: React.js, HTML, CSS, TailwindCSS

Backend: Java, Spring Boot

AI API: Google Gemini API

Database (Optional): MySQL / MongoDB for message history

Other Tools: Maven, Node.js, Axios

Demo

Add screenshots or GIFs here to show the chatbot in action.

Installation
Prerequisites

Node.js & npm installed

Java JDK installed

Maven installed

Steps

Clone the repository

git clone https://github.com/your-username/ai-chatbot.git
cd ai-chatbot


Backend Setup (Spring Boot)

cd backend
mvn clean install
mvn spring-boot:run


Make sure to set your Gemini API key in environment variables:

export GOOGLE_API_KEY="YOUR_API_KEY"


Frontend Setup (React.js)

cd frontend
npm install
npm start

Usage

Open the frontend URL (default: http://localhost:3000)

Start typing messages in the chatbox

Receive AI responses in real-time

API Integration

The backend communicates with Google Gemini API:

Endpoint: /api/chat

Method: POST

Request Body:

{
  "prompt": "Hello, how are you?"
}


Response Body:

{
  "response": "I'm doing well! How can I help you today?"
}

Folder Structure
ai-chatbot/
├── backend/                # Spring Boot backend
│   ├── src/main/java
│   │   └── com.example.gemini
│   │       ├── controller/  # API controllers
│   │       ├── service/     # Business logic & Gemini API integration
│   │       └── dto/         # Request & response objects
│   └── pom.xml
├── frontend/               # React.js frontend
│   ├── src
│   │   ├── components       # Chat UI components
│   │   ├── services         # API calls
│   │   └── App.js
│   └── package.json
└── README.md
