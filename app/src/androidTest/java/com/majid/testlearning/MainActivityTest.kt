package com.majid.testlearning

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @get : Rule
    val activityScenario = ActivityScenario.launch(MainActivity::class.java)
    @Test
    fun test_isActivityInView() {
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_title_next_button() {
        onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))
        onView(withId(R.id.button_next_activity)).check(matches(isDisplayed())) // one way to check visibility

        onView(withId(R.id.button_next_activity)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))// second way to the view visibility

    }

    @Test
    fun test_isTitleTextDisplayedCorrectly() {

        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.text_mainactivity)))
    }
}