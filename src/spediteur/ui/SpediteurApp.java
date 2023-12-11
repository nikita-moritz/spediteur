package spediteur.ui;

public class SpediteurApp {

    private  boolean isAppRunning = true;
    public SpediteurApp() {
        runApp();
    }

    public void runApp() {
        while (isAppRunning) {
            showWelcomeMessage();
            showMenu();
            closeApp();
        }
    }

    private void showMenu() {
    }

    private void closeApp() {isAppRunning = false;    }

    private void handleLogin() {
        
    }

    private void showWelcomeMessage() {
        String welcomeText =" __          __  _                       _           _____                _ _ _                                     \n" +
                " \\ \\        / / | |                     | |         / ____|              | (_) |                  /\\                \n" +
                "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   | |_ ___   | (___  _ __   ___  __| |_| |_ ___ _   _ _ __ /  \\   _ __  _ __  \n" +
                "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\  | __/ _ \\   \\___ \\| '_ \\ / _ \\/ _` | | __/ _ \\ | | | '__/ /\\ \\ | '_ \\| '_ \\ \n" +
                "    \\  /\\  /  __/ | (_| (_) | | | | | | | || (_) |  ____) | |_) |  __/ (_| | | ||  __/ |_| | | / ____ \\| |_) | |_) |\n" +
                "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|  \\__\\___/  |_____/| .__/ \\___|\\__,_|_|\\__\\___|\\__,_|_|/_/    \\_\\ .__/| .__/ \n" +
                "                                                          | |                                          | |   | |    \n" +
                "                                                          |_|                                          |_|   |_|    ";

        System.out.println(welcomeText);
    }
}




