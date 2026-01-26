package vkn.xperia.sb.bp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SpringbootBestPracticesApplicationTest {
    @Test
    void contextLoads() {
    }
    @Test
    void test1(){
        assertEquals(1,1);
    }
    @Test
    void test2(){
        assertEquals(3,1);
    }
}