# 스프링 입문

## 인프런 강의

스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술

https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8

## 환경 구성

+ JDK 11 설치
+ Maven 3.6 설치
+ VS Code 설치
+ VS Code Extension 설치
  + Java Extension Pack (by Microsoft)
  + Spring Boot Extension Pack (by Pivotal)
+ vscode 에서 ctrl+shift+p 눌러서 `Spring Initializr: Create a Gradle Project...` 선택
+ 안정화 최신 버전 선택(2.3.5), Java 선택, Group Id 입력, 아티팩트 Id 입력, JAR 선택, 11버전 선택, 의존성에 `Spring Boot DevTools`, `Spring Web`, `Thymeleaf` 선택하고 저장할 경로 선택

## 첫 페이지 작성

+ src/main/resources/static/index.html 생성
+ 내용 작성하면 스프링이 이걸 루트 접속 시 응답할 때 사용한다고 함 (이름이 index.html 이여야 함)

## 첫 템플릿 페이지 작성

+ Thymeleaf는 템플릿 엔진 (ASP.NET의 Razor 같은 거)
+ HelloController.java 를 만들어서 내용을 넣고, 리턴하는 이름 "hello" 와 똑같은 이름의 파일을 templates 폴더 아래에 생성 `src/main/resources/templates/hello.html`


