package eu.nnn4.webapi.service;

import eu.nnn4.webmodel.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class UserServiceTest {
    private static List<User> users = new ArrayList<>();
    @BeforeAll
    static void setUp() {
        int numA=9;
        for(int i=0;i<numA;i++)
            users.add(FakeDataGenerator.createUser());
    }

    @Test
    void getAllUsers() {
        log.info("size: "+users.size());
        assertEquals(users.size(),9);

        log.info(Arrays.toString(users.toArray()));
    }
}