package com.majid.testlearning

object RegistrationUtil {

    private val existingUsers = listOf("majid", "manzoor", "mir")

    /**
     *  Test Cases
     *  the input is not valid if...
     *  the userName us already Taken
     *  the username / password is empty
     *  password and confirmedPassword does not match
     *  password contain at least 2 digit
     * */

    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {

        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }
        if (userName in existingUsers) {
            return false
        }

        if (password != confirmedPassword) {
            return false
        }
        if (password.count() { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}