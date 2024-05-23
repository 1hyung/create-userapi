# Chapter 3. 주특기 숙련 튜터링 과제 - User 생성하는 API 만들기

## 기능 요구사항


> 💡 Goal : 투두앱 백엔드 서버 만들기
>
> - 지금까지 배운 Kotlin 문법과 Spring을 응용해서 User 생성하는 API를 만들어봅니다.
> - 데이터베이스 연결을 통해 관리를 해봅니다.
>
>

```
 ⚙ features : 필수 구현 기능

    # User를 생성하는 API 만들기.
    
        class User {id: long, name: string}
    
        위 형태를 가진 User를 controller -> service -> repository를 이용해서 구현해보세요.
    
        repository는 실제 database까지 연동하여 jpa repository의 save를 이용해서 데이터베이스에 저장되는것까지 확인할 수 있도록 해주세요.
    
        name이 10글자가 넘으면 RuntimeException을 발생시켜 400 status를 반환하도록 만들어주세요.


 😆 features : 선택 구현 기능
 
    - CRUD 생성하기
          

```

### 필요한 개념
1. API
2. Package, SoC(관심사 분리)
   1. User 하위에 Controller, Service, Repository 만들기
3. Github에 Repository 만들기
4. Swagger 적용
5. IntelliJ에 Database 연결하기
6. try catch문을 활용해서 예외처리를 통해 400 status를 반환

### 구현 순서
1. Github에 Repository 만들기
2. SoC
3. Web Layer 작성하기
4. Database 연결하기
5. 400 반환 확인하기

## 기능

### 사용자(User) 기능
1. User를 ID와 NAME을 사용하여 추가할 수 있습니다.


### 관리자(Admin) 기능
1. 차후 추가될 예정입니다.


## 수정할 내용
### CRUD 적용

## 환경설정<br/>
Language : Kotlin<br/>
IDLE : IntelliJ community<br/>
JDK : temurin-17 <br/>
