# Проект по автоматизации UI тестов для сайта [Apple](https://www.apple.com/)
<a href="https://www.apple.com/"><img width="30%" title="Apple" src="images/icons/apple-icon.png"></a>

## Структура

---

- <a href="#-технологии-и-инструменты">Стек</a>
- <a href="#-проведенные-автотесты">Проведенные автотесты</a>
- <a href="#-сборка-в-jenkins">Сборка в Jenkins</a>
- <a href="#-запуск-из-терминала">Запуск из терминала</a>
- <a href="#-Allure-отчет">Allure отчет</a>
- <a href="#-интеграция-с-Allure-TestOps">Интеграция с Allure TestOps</a>
- <a href="#-интеграция-с-jira">Интеграция с Jira</a>
- <a href="#-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#-пример-запуска-автотеста">Видео пример запуска автотеста</a>

## 🛠️ Стек

---

<p align="center">
<img src="images/icons/java.png" width="50" />
<img src="images/icons/Intelij_Idea.png" width="50" />
<img src="images/icons/github.png" width="50" />
<img src="images/icons/JUnit5.png" width="50" />
<img src="images/icons/Selenide.png" width="50" />
<img src="images/icons/Selenoid.png" width="50" />
<img src="images/icons/Gradle.png" width="50" />
<img src="images/icons/Jenkins.png" width="50" />
<img src="images/icons/Allure_Report.png" width="50" />
<img src="images/icons/Allure_TestOps.png" width="50" />
<img src="images/icons/Telegram.png" width="50">
<img src="images/icons/Jira.png" width="50" />
</p>

## ✅ Проведенные автотесты

---

### Тесты навигации сайта Apple:

- Параметризованный тест, проверяющий корректность url при перемещении по сайту
    - Store
    - Mac
    - iPad
    - iPhone
    - Watch
    - Vision
    - AirPods
- Параметризованный тест, проверяющий отображаемость карточек устройств на сайте
  - Mac
  - iPhone
  - iPad
  - Apple Watch
  - Apple Vision Pro

## 📋 Сборка в [Jenkins](https://jenkins.qa.guru/job/apple-store-UI-tests/)

---

<img src="images/screenshots/jenkins-job.png">

### Параметры сборки в Jenkins
Сборка в Jenkins включает в себя только один параметр, отвечающий за интеграцию с Allure TestOps

При запуске тестов из Allure TestOps это параметр подставляется автоматически


## ▶️ Запуск из терминала

---

### Локальный запуск:
```
gradle clean test
```

### Удалённый запуск:
```
clean test
```

## 📑 [Allure отчет](https://jenkins.qa.guru/job/apple-store-UI-tests/24/allure/)

---

### Главный экран отчета
<img src="images/screenshots/allure-report.png">

### Страница с проведенными тестами
<img src="images/screenshots/allure-reports-suites.png">


## 📑 Интеграция с [Allure TestOps](https://allure.qa.guru/project/5376/dashboards/5682)

---

### Экран с результатами тестов
<img src="images/screenshots/allure-testops-dashboard.png">

### Страница с тестами в Allure TestOps
<img src="images/screenshots/allure-testops-tests-cases.png">


## 📑 Интеграция с [Jira](https://jira.qa.guru/browse/MUL-48)

---

### Страница с описанием задачи в Jira
<img src="images/screenshots/jira-task.png">


## 💬 Отчет в Telegram

---

<img src="images/screenshots/telegram.png">

---

## 🎦 Пример запуска автотеста
> К каждому тесту в отчете прилагается видео.

<img src="images/gif/selenoid.gif">