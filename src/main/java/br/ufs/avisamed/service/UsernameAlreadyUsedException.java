package br.ufs.avisamed.service;

public class UsernameAlreadyUsedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UsernameAlreadyUsedException() {
        super("Email ja foi utilizado!");
    }
}
