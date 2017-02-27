/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.knights;

import java.io.PrintStream;

/**
 *
 * @author Tazzmanian
 */
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Minstrel {

    private PrintStream stream;

//    @Pointcut("com.springinaction.knights.BraveKnight.embarkOnQuest()")
//    private void embarkOnQuest() {
//    }
    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    @Before("execution(* com.springinaction.knights.BraveKnight.embarkOnQuest())")
    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    @After("execution(* com.springinaction.knights.BraveKnight.embarkOnQuest())")
    public void singAfterQuest() {
        stream.println("Tee hee hee, the knight did emark on the quest!");
    }

}
