package org.example;

public class ReplyService {

    // Enum for reply type
    public enum ReplyType { FORMAL, FRIENDLY, CONCISE }

    // The required method
    public String reply(String message, ReplyType type) {
        // 1. Input handling
        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }

        // Normalize input
        String input = message.trim().toLowerCase();

        // 2. Message Matching
        switch (input) {
            case "hi":
            case "hello":
                if (type == ReplyType.FORMAL) return "Hello. How may I assist you today?";
                if (type == ReplyType.FRIENDLY)
                    return input.equals("hi") ? "Hey there! 😊 How can I help?" : "Hi! 👋 What’s up?";
                return "Hello. How can I help?";

            case "how are you":
                if (type == ReplyType.FORMAL) return "I am functioning properly. How may I assist you?";
                if (type == ReplyType.FRIENDLY) return "Doing great! 😄 How can I help?";
                return "I’m good. How can I help?";

            case "i need help":
                if (type == ReplyType.FORMAL) return "I can assist with that. Please provide more details.";
                if (type == ReplyType.FRIENDLY) return "I’ve got you! 🙂 Tell me a bit more.";
                return "Share details; I’ll help.";

            case "can you help me with my account":
                if (type == ReplyType.FORMAL) return "Certainly. Please describe the account issue.";
                if (type == ReplyType.FRIENDLY) return "Sure thing! 😊 What’s wrong with the account?";
                return "Describe the account issue…";

            case "thanks":
                if (type == ReplyType.FORMAL) return "You are welcome.";
                if (type == ReplyType.FRIENDLY) return "Anytime! 🙌";
                return "You’re welcome.";

            case "bye":
                if (type == ReplyType.FORMAL) return "Goodbye.";
                if (type == ReplyType.FRIENDLY) return "See you later! 👋";
                return "Goodbye.";

            case "what is your name":
                if (type == ReplyType.FORMAL) return "I am your virtual assistant.";
                if (type == ReplyType.FRIENDLY) return "I’m your helper bot 🤖";
                return "I’m your assistant.";

            default: // any other text
                if (type == ReplyType.FORMAL) return "Could you clarify your request?";
                if (type == ReplyType.FRIENDLY) return "Could you tell me more?";
                return "Please clarify.";
        }
    }
}
