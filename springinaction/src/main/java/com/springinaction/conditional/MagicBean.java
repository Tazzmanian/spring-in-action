/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Tazzmanian
 */
@Configuration
public class MagicBean {

    @Bean
    @Conditional(MagicExistCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

}
