package dev.marcos.course.config;

import dev.marcos.course.entity.Order;
import dev.marcos.course.entity.User;
import dev.marcos.course.repository.OrderRepository;
import dev.marcos.course.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    public TestConfig(UserRepository userRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, LocalDateTime.parse("2025-06-20T19:53:07Z", DateTimeFormatter.ISO_DATE_TIME), u1);
        Order o2 = new Order(null, LocalDateTime.parse("2025-07-21T03:42:10Z", DateTimeFormatter.ISO_DATE_TIME), u2);
        Order o3 = new Order(null, LocalDateTime.parse("2025-07-22T15:21:22Z", DateTimeFormatter.ISO_DATE_TIME), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
