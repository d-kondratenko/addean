package com.epic.addean.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DatabaseRepositoryTest {
    /**
     * Method under test: {@link DatabaseRepository#callProcedure(String, Integer, String)}
     */
    @Test
    void testCallProcedure() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R008 Failed to instantiate class under test.
        //   Diffblue Cover was unable to construct an instance of DatabaseRepository.
        //   Ensure there is a package-visible constructor or factory method that does not
        //   throw for the class under test.
        //   If such a method is already present but Diffblue Cover does not find it, it can
        //   be specified using custom rules for inputs:
        //   https://docs.diffblue.com/knowledge-base/cli/custom-inputs/
        //   This can happen because the factory method takes arguments, throws, returns null
        //   or returns a subtype.
        //   See https://diff.blue/R008 for further troubleshooting of this issue.

        // Arrange, Act and Assert
        assertEquals("Cannot invoke \"javax.persistence.EntityManager.createStoredProcedureQuery(String)\" because \"this"
                + ".entityManager\" is null", (new DatabaseRepository()).callProcedure("Product Nr", 2, "Ean Nr"));
    }
}

