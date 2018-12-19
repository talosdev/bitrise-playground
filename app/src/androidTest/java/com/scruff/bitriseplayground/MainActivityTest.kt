package com.scruff.bitriseplayground

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.doesNotExist
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by Perry Street Software Inc. on Dec 19, 2018.
 *
 * @author Aris Papadopoulos (aris@scruff.com)
 */

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testThatMainPromptIsDisplayed() {
        onView(withText("Welcome to bitrise")).check(matches(isDisplayed()))
    }

    @Test
    fun when_ButtonIsClicked_then_TextViewChanges() {
        onView(withText("Welcome to bitrise")).check(matches(isDisplayed()))
        Thread.sleep(4000)
        onView(withText("Please click here")).perform(click())
        Thread.sleep(4000)
        onView(withText("Welcome to bitrise")).check(doesNotExist())
        onView(withText("Bitrise is awesome")).check(matches(isDisplayed()))


    }


}