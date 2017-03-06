/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.externals;

import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectFromPropertiesWithRequiredProperties {

    @Test(expected = BeanCreationException.class)
    public void assertBlankDiscProperties() {
        new AnnotationConfigApplicationContext(EnvironmentConfigWithRequiredProperties.class);
    }

}
