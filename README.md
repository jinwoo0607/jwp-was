# 웹 애플리케이션 서버
## 진행 방법
* 웹 애플리케이션 서버 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

##1주차 작업 내역
feat ($step1): HTTP 파싱 및 IF문 중복 제거

새로 추가한 작업 $step1:
- FigureConstructor 클래스 추가
- FigureFactory 클래스 내 중복 IF문 FigureConstructor 클래스 사용하여 해결
- RequestLineTest 파라미터 파싱 테스트 추가
- RequestLine 파라미터 분리 메소드 추가

새로 추가한 작업 $step2:
- UserController 클래스 추가 (유저 관련 호출 담당)
- ControllerCreator 인터페이스 추가
- HttpStatus Enum 추가 (HTTP 상태값 관리)
- HttpControllerManage 클래스 추가 (컨트롤러 클래스 관리)
- HttpMethodParameter 클래스 추가 (GET, POST 파라미터 추출 클래스)
- HttpResponse 클래스 추가 (HTTP 응답 담당)

새로 추가한 작업 $step2-2:
- UserCreateController 클래스 추가 (유저 생성 클래스)
- UserListController 클래스 추가 (유저 리스트 클래스)
- UserLoginController 클래스 추가 (유저 로그인 클래스)
- HttpConverter 클래스 추가 (http 메시지 파싱 담당 클래스)
- HttpFileConverter 클래스 추가 (파일 READ 담당 클래스)
- HttpFileResource ENUM 추가 (웹 파일 리소스)
- HttpHeaderConverter 클래스 추가 (헤더 파싱 클래스)
- HttpParameterConverter 클래스 추가 (기존 HttpMethodParamter 위치 이동 및 클래스 이름 변경)
- HttpEntity 클래스 추가 (기존 HttpParseVO를 변환 및 HTTP 전문 메시지를 정보를 저장)
- HttpHeader 클래스 추가 (헤더 정보를 저장)
- AbstractControllerCreator 추상 컨트롤러 추가 (컨트롤러 추상화 작업)
- ControllerCreator 인터페이스 추가
- HttpController 클래스 추가 (AbstractControllerCreator 받아 컨트롤러들의 호출을 담당)

새로 추가한 작업 $step2-3:
- HttpResponseEntity 클래스 추가 (읽은 요청을 응답하기 위해 정리하는 클래스)
- HttpRequest 클래스는 Http 파싱만 하게 분리
- HttpResponse 클래스는 정리된 HttpResponseEntity를 받아 응답 결과를 리턴한다

새로 추가한 작업 $step3:
- WebServer 스레드풀 추가
- HttpRequest 기존 HttpEntity를 합침
- HttpResponse 기존 HttpResponseEntity를 합침
- HttpHeader req,response 시 각각 생성
- 기존 HttpResponseEntity로 response 만드는걸 직접적으로 접근
- RequestLine 을 ServletContainer로 이름 변경

새로 추가한 작업 $step4:
- HttpSession 클래스 추가
- HttpSessionManager 클래스 추가
- addCookie 메소드 삭제 HttpSession으로 변경 작업
- Header 쿠키값 Session 에 넣는 작업