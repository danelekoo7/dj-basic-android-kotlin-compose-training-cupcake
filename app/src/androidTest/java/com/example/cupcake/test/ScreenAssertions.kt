package com.example.cupcake.test

import androidx.navigation.NavController
import org.junit.Assert.assertEquals

fun NavController.assertCurrentRouteName(expectedRoadName: String) {
    assertEquals(expectedRoadName, currentBackStackEntry?.destination?.route)
}