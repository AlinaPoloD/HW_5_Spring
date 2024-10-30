package com.example.HW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HwApplication {

	public static void main(String[] args) {
		SpringApplication.run(HwApplication.class, args);
	}

}

/*
Вам предстоит создать приложение для управления списком задач с использованием
Spring Boot и Spring Data JPA. Требуется реализовать следующие функции:
		1. Добавление задачи.
		2. Просмотр всех задач.
3. Просмотр задач по статусу (например, "завершена", "в процессе", "не начата").
		4. Изменение статуса задачи.
5. Удаление задачи.
Структура задачи:
		- ID (автоинкрементное)
- Описание (не может быть пустым)
- Статус (одно из значений: "не начата", "в процессе", "завершена")
- Дата создания (автоматически устанавливается при создании задачи)*/