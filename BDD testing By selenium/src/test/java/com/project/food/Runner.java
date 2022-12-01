package com.project.food;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\sts\\food\\Features", glue={"com.project.food"} , publish=true)
public class Runner {

}
