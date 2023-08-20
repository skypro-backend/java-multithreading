package patterns.structural.facade.service;

// Подсистема, предоставляющая функциональность для работы с аутентификацией
class AuthenticationSubsystem {
    public void authenticate(String username, String password) {
        System.out.println("Проверка аутентификации пользователя " + username);
    }
}
