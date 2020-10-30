package com.yacine.amouche.kata.tennis;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" })
// features = "classpath:features", glue = "com.kata.tennis.tennis")
public class PartieTest {
}
