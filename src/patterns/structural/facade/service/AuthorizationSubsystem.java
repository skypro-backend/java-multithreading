package patterns.structural.facade.service;

// Подсистема, предоставляющая функциональность для работы с авторизацией
class AuthorizationSubsystem {
    public void authorize(String username) {
        System.out.println("Проверка авторизации пользователя " + username);
    }
}
