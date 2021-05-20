package com.example.tests

object RegistrationUtil {

    private val existingUsers = listOf("Claudio", "André")

    /**
     * o input não é valido se...
     * ... username/password estiver vazio
     * ... username já estiver registrado
     * ... confirmedPassword não for o mesmo que passoword
     * ... password for menor que 3 caracteres
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String

    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }

        if (username in existingUsers) {
            return false
        }

        if (password != confirmedPassword) {
            return false
        }

        if (password.count { it.isDigit()} < 3) {
            return false
        }

        return true;
    }

}