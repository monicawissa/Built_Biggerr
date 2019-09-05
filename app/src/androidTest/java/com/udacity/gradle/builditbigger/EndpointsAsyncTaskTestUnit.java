
package com.udacity.gradle.builditbigger;
/**
 * Created by Theodosios Tziomakas as part of Udacity Nanodegree's project 'Build it bigger' on 15-April-17.
 */

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class EndpointsAsyncTaskTestUnit {
    String TAG = EndpointsAsyncTask.class.getSimpleName();
   @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);



   @Test
   public void testJokeIsNotEmpty() throws Exception {

       EndpointsAsyncTask aTest =  new EndpointsAsyncTask();
       aTest.execute(InstrumentationRegistry.getContext());
       String joke = aTest.get(5, TimeUnit.SECONDS);
       Assert.assertTrue(!joke.equals(""));
   }

    @Test
    public void testVerifyResponse() {


        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.jokes_text_view)).check(matches(isDisplayed()));
    }

}

