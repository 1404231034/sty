package com.lpc.test;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import static org.apache.logging.log4j.FormatterLoggerManualExample.logger;
public class TestClassLoader {

    private static final Logger logger = Logger.getLogger(TestClassLoader.class);

    public static void main(String[] a){
//        PropertyConfigurator.configure("log4j2.xml");
        ClassLoader c = TestClassLoader.class.getClassLoader();
        logger.error("BJYGHBJHGBJHJ");
//        System.out.println(c);
        ClassLoader c1 = c.getParent();
        logger.error(c1);
//        System.out.println(c1);
        ClassLoader c2 = c1.getParent();
//        logger.info(c2);
//        System.out.println(c2);
        //输出日志信息，测试日志级别的作用（配置在配置文件中），仅仅输出大于等于目前有效级别的日志信息
        logger.debug("[1]-my level is DEBUG 天");
        logger.info("[2]-my level is INFO");
        logger.warn("[3]-my level is WARN");
//        logger.error("[4]-my level is ERROR");
    }
}
