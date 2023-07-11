# BusReservationProject🚍
> 장애인들을 위한 저상버스 예약 시스템
> 사용자 페이지, 버스전용 페이지 두가지로 구성

#### 사용자 페이지
- 버스 번호별로 시간표 조회 기능
- 정류장 검색기능
- 예약기능

#### 버스전용 페이지
- 운행할 버스 선택
- 예약 현황
- 예약 완료처리 기능

### 기술 스택
MySQL, JPA, Spring, Thymeleaf+BootStrap

### DB 설계
![image](https://github.com/Yang-soeun/BusReservationProject/assets/87464750/daa5fa96-c54f-4254-a1e7-41c45ffaa9ae)


## 📑 사용자 페이지
### 💡 시간표 조회


### 💡 정류장 검색 & 예약
- 가장 빨리 오는 버스만 예약 가능
- 탑승지와 하차지를 선택하면 탑승지 ~ 하차지까지의 정류장 예약 처리
- 종점은 탑승지로 예약 불가
<br>



### 💡 예약이 있는 경우
- 예약이 있는 경우 예약 불가능


## 📑 버스전용 페이지
- 로그인된 버스 번호에 따라 해당 버스번호로 예약된 정보만 나타냄
- 예약된 탑승 정류장과 하자 정류장 정보가 나타남
- 하차 후 완료 버튼을 누르면 예약 완료 처리


