/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.externals;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EnvironmentConfigWithDefaults.class)
public class InjectFromPropertiesWithDefaultValues {

    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void assertBlankDiscProperties() {
        assertEquals("U2", blankDisc.getArtist());
        assertEquals("Rattle and Hum", blankDisc.getTitle());
    }

}
