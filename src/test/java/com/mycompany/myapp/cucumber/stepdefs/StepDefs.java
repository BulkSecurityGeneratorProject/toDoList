package com.mycompany.myapp.cucumber.stepdefs;

import com.mycompany.myapp.ToDoListApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ToDoListApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
