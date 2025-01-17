private static boolean login() {
    // GitHub Commit: Added login functionality by Dominika
    int attempts = 0;
    while (attempts < 3) {
        System.out.print("Felhasználónév: ");
        String username = scanner.nextLine();
        System.out.print("Jelszó: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Sikeres bejelentkezés!");
            return true;
        } else {
            System.out.println("Hibás felhasználónév vagy jelszó.");
            attempts++;
        }
    }
    return false;
}
