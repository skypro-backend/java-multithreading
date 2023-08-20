package patterns.structural.facade;

import patterns.structural.facade.service.SecurityFacade;

// Пример использования фасада
public class Main {
    public static void main(String[] args) {
        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.login("user123", "password");
    }
}
