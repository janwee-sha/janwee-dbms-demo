package com.janwee;

import com.janwee.entity.Address;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AddressControllerTest {
    @Autowired
    private TestRestTemplate template;
    @Test
    public void testReadAll(){
        assertThat(template.getForEntity("/addresses", List.class).getStatusCode().is2xxSuccessful());
    }
    @Test
    public void testCreate(){
        assertThat(template.postForEntity("/addresses", new Address("测试新增地址实体"),Address.class)
                .getStatusCode().is2xxSuccessful());
    }
}
