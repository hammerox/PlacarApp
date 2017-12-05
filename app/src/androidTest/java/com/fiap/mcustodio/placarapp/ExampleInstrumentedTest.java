package com.fiap.mcustodio.placarapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activity
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        onView(withId(R.id.edittext_main_team1))
                .perform(typeText("MEU TIME"), closeSoftKeyboard());
        onView(withId(R.id.button_main_go))
                .perform(click());
        onView(withText("Exemplo")).inRoot(withDecorView(not(activity.getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));
        onView(withId(R.id.edittext_main_team1))
                .check(matches(withText("MEU TIME")));
    }
}
