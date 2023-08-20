package patterns.structural.facade.service;

// Фасад, предоставляющий упрощенный интерфейс для работы с подсистемами
public class SecurityFacade {
    private final AuthenticationSubsystem authenticationSubsystem;
    private final AuthorizationSubsystem authorizationSubsystem;

    public SecurityFacade() {
        this.authenticationSubsystem = new AuthenticationSubsystem();
        this.authorizationSubsystem = new AuthorizationSubsystem();
    }

    public void login(String username, String password) {
        authenticationSubsystem.authenticate(username, password);
        authorizationSubsystem.authorize(username);
        System.out.println("Пользователь " + username + " успешно вошел в систему");
    }
}
