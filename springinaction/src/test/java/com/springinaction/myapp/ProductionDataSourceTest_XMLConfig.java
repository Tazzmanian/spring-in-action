/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.myapp;

import javax.sql.DataSource;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Tazzmanian
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:datasource-config.xml")
@ActiveProfiles("prod")
public class ProductionDataSourceTest_XMLConfig {

    @Autowired(required = false)
    private DataSource dataSource;

    @Test
    public void shouldBeEmbeddedDatasource() {
        // should be null, because there isn't a datasource configured in JNDI
        assertNull(dataSource);
    }
}
