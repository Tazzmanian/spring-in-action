/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Teodor Todorov
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisk compactDisk;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(compactDisk);
    }

    @Test
    public void play() {
        log.clearLog();
        log.enableLog();
        player.play();
        Assert.assertTrue(log.getLogWithNormalizedLineSeparator().compareTo("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n") == 0);
    }
}
