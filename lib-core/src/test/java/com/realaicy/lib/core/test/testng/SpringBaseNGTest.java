package com.realaicy.lib.core.test.testng;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * 测试基类
 *
 * @author realaicy
 * @version 1.1
 * @since 1.1
 */
//@ContextConfiguration({"classpath:applicationContext-core-test.xml"})
@ContextConfiguration(classes = com.realaicy.lib.core.test.testng.SpringTestConfig.class)
public abstract class SpringBaseNGTest extends AbstractTestNGSpringContextTests {

}
