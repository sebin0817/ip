package duke.core;

public class Duke {

    public static void main(String[] args) {
        Chatbot tribara = new Chatbot("Tribara");
        tribara.startChat(System.in, System.out);
    }
}
