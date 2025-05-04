package com.example.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void testGetUserName() {
        UserService svc = new UserService();
        assertEquals("Alice", svc.getUserName());
    }

    // If method was renamed:
    // @Test
    // public void testFetchUserName() {
    //     UserService svc = new UserService();
    //     assertEquals("Alice", svc.fetchUserName());
    // }
}