package com.fiap.mcustodio.placarapp;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

    @Mock Context context;


    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void shouldDoSomething() {
        when(context.getString(R.string.app_name)).thenReturn("NOSSO APP");

        boolean variable = true;
        assertThat(variable, is(true));

        assertThat(context.getString(R.string.app_name), is("NOSSO APP"));
    }
}