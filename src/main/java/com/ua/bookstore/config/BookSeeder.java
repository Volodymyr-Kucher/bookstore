package com.ua.bookstore.config;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.repository.BookRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BookSeeder implements ApplicationRunner {

    private final BookRepository repository;

    public BookSeeder(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Book(null, "Кобзар", "Тарас Шевченко",
                new BigDecimal("250.00"), 1840, "/covers/kobzar.jpg",
                "Збірка поетичних творів Тараса Шевченка.", "Поезія"));

        repository.save(new Book(null, "Тіні забутих предків", "Михайло Коцюбинський",
                new BigDecimal("180.00"), 1911, "/covers/tini.jpg",
                "Повість про кохання гуцулів Івана та Марічки.", "Проза"));

        repository.save(new Book(null, "Місто", "Валер'ян Підмогильний",
                new BigDecimal("220.00"), 1928, "/covers/misto.jpg",
                "Роман про юнака, що приїхав із села підкорювати Київ.", "Проза"));

        repository.save(new Book(null, "Лісова пісня", "Леся Українка",
                new BigDecimal("190.00"), 1911, "/covers/lisova-pisnya.jpg",
                "Драма-феєрія про кохання Мавки і Лукаша.", "Драма"));

        repository.save(new Book(null, "Енеїда", "Іван Котляревський",
                new BigDecimal("210.00"), 1798, "/covers/eneyida.jpg",
                "Бурлескно-травестійна поема, перший твір нової української літератури.", "Поезія"));
    }
}
