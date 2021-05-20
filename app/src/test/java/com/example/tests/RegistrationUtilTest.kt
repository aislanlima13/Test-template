package com.example.tests

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Aislan",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `incorrectly confirmed password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Aislan",
            "123",
            "abc"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empety password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Aislan",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Aislan",
            "abc2fa",
            "abc2f"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Aislan",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }


}