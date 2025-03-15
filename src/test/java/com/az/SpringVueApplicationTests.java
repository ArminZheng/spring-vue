package com.az;

import com.az.bean.Dog;
import com.az.bean.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringVueApplicationTests {

    @Autowired
    ApplicationContext ioc;

    @Test
    void testHelloService(){
        boolean helloService = ioc.containsBean("helloService002");
        System.out.println(helloService);
    }

    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    void multiply() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = "{\"name\":\"dogge\",\"gender\":true,\"age\":18} ";
        Dog dog = mapper.readValue(jsonStr, Dog.class);
        System.out.println(dog);
        int s = 1;
        for (int i = 2; i <10; i++) {
            System.out.println(i+ "的阶乘是： " +(s*=i));
        }
        System.out.println(person);
    }

    /* Data access test */
    @Autowired
    DataSource dataSource;

    @Test
    void dataSourceAccess() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
