package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private ClientRepository clientRepository;
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/test/1")
    public String meth() {
//         clientRepository.save(new ClientEntity(null, "sdfsd"));
//        ClientEntity clientEntity = clientRepository.findById(22l).get();
//        clientEntity.setName("test");
//        clientRepository.save(clientEntity);
        return "test"+port;

    }

    @GetMapping("/1")
    public void meth1() {


        clientRepository.deleteById(20l);

    }

}
