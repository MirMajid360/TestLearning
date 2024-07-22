package com.majid.testlearning

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty user name returns false`(){

        val result = RegistrationUtil.validateRegistrationInput("","1234","1234")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){

        val result = RegistrationUtil.validateRegistrationInput("Majid","1234","1234")
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){

        val result = RegistrationUtil.validateRegistrationInput("majid","1234","1234")
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){

        val result = RegistrationUtil.validateRegistrationInput("Majid","","")
        assertThat(result).isFalse()
    }

    @Test
    fun `password and conformed password not match  returns false`(){

        val result = RegistrationUtil.validateRegistrationInput("Majid","1245","1234")
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains at last 2 digits returns false`(){

        val result = RegistrationUtil.validateRegistrationInput("Majid","majid1","majid1")
        assertThat(result).isFalse()
    }
}