## HTTP와 HTTPS


# HTTP


1. HTTP란?
   - HyperText Transfer Protocol
   - 서로 다른 시스템들 사이에서 통신을 주고 받게 해주는 application 계층의 프로토콜


2. HTTP의 특징
   - TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송함
   - 비연결성 : 클라이언트와 서버가 한번 연결을 맺은 후에 클라이언트의 요청에 대해 서버가 응답을 마치면 연결을 끊어버림
   - 무상태성 : 서버가 클라이언트와의 연결에 대한 정보를 저장하지 않음 -> 클라이언트 식별 불가능


3. HTTP 연결 과정
    - TCP 연결을 열어줌 -> HTTP 메세지 전송 -> 서버가 보낸 응답 확인 -> 연결을 닫음


4. HTTP 메소드
    - 클라이언트가 서버에게 특정 요청을 보낼 때 요청의 종류를 알리기 위해 메세지에 HTTP 메소드를 포함시킴
    - GET, POST, PUT, PATCH, DELETE 등
        - GET : 데이터 조회
        - POST : 데이터 등록
        - PUT : 데이터 생성 및 대체
        - DELETE : 데이터 삭제


5. HTTP 상태 코드
    - 서버가 클라이언트에게 응답을 보낼 때 요청에 대한 처리 상태를 알려주기 위해 사용
    - 200, 201, 401, 404 등
        - 200 : 클라이언트의 요청을 정상적으로 수행함
        - 201 : 클라이언트가 어떠한 리소스 생성을 요청, 해당 리소스가 성공적으로 생성됨(POST를 통한 리소스 생성 작업 시)
        - 204 : 클라이언트가 어떠한 리소스 삭제를 요청, 해당 리소스가 성공적으로 삭제됨
        - 400 : 클라이언트의 요청이 부적절 할 경우 사용하는 응답 코드
        - 401 : 클라이언트가 인증되지 않은 상태에서 보호된 리소스를 요청했을 때 사용하는 응답 코드
        - 403 : 유저 인증상태와 관계 없이 응답하고 싶지 않은 리소스를 클라이언트가 요청했을 때 사용하는 응답 코드
        - 404 : 클라이언트가 요청한 리소스에서는 사용 불가능한 Method를 이용했을 경우 사용하는 응답 코드
        - 500 : 서버에 문제가 있을 경우 사용하는 응답 코드
        - 502 : 게이트웨이 오류


# HTTPS


1. HTTPS란?
   - HyperText Transfer Protocol over Secure Socket Layer
   - HTTP의 보안이 강화된 버전


2. HTTP vs HTTPS
    - 일반 HTTP 프로토콜에서는 메시지가 암호화되지 않음 -> 데이터 도난 문제
    - HTTPS 프로토콜에서는 SSL / TLS 인증서를 추가하여 보안 문제를 해결함


3. SSL / TLS 인증서
    - 특정 웹 서버의 공개 키 및 서버 정보를 포함하는 보안 인증서
    - 웹 서버의 신원을 확인하는 데 사용됨 -> 중간자 공격 방지 가능
    - 공개 키를 사용하여 데이터를 암호화한 뒤 전송 -> 웹 서버에서 공개 키를 사용하여 암호문을 해독
    - 유효기간이 존재하며 만료 시 재발급 필요


## RESTful한 URL 설계

- 이벤트 목록 조회 : GET /events
- 이벤트 조회 : GET /events/{eventID}
- 이벤트 등록 : POST /events
- 이벤트 수정 : PUT /events/{eventId}
- 이벤트 삭제 : DELETE /events/{eventId}
- 이벤트 상태 변경 : PUT /events/{eventId}/state
- 특정 이벤트의 주문 목록 조회 : GET /events/{eventId}/orders
- 멤버 목록 조회 : GET /members
- 특정 멤버 권한 변경 : PUT /members/{memberId}/power
- 특정 멤버 정보 조회 : GET /members/{memberId}
- 특정 멤버 정보 변경 : PUT /members/{memberId}
- 멤버 등록 : POST /members