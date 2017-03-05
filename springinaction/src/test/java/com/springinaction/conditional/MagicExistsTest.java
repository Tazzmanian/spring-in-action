/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.conditional;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import javax.persistence.Basic;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.BeforeClass;
import org.springframework.core.env.AbstractEnvironment;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MagicConfig.class)
public class MagicExistsTest {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private MagicBean magicBean;

    /*
   * This test will fail until you set a "magic" property.
   * You can set this property as an environment variable, a JVM system property, by adding a @BeforeClass
   * method and calling System.setProperty() or one of several other options.
     */
    @BeforeClass
    public static void setContext() {
        System.setProperty("magic", "some bean");
    }

    @Test
    public void shouldNotBeNull() {
        assertTrue(context.containsBean("magicBean"));
        assertNotNull(magicBean);
    }

}
