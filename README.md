# 전진영 202130129

## 5월 17일
수업 내용

### 컨테이너와 배치, 배치관리자 개념
* 컨테이너마다 하나의 배치 관리자 존재

* FlowLayout
    * 생성자 : FlowLayout(align, hGap, vGap)
* BorderLayout
    * 생성자 : BorderLayout(hGap, vGap)
* GridLayout
    * 생성자 : GridLayout(rows, cols)
* CardLayout
    * 생성자 : CardLayout()

## 4월 19일
수업 내용

### 오버라이딩, 오버로딩
동적, 정적  

### 추상 클래스
추상 메소드
* abstract로 선언된 메소드, 메소드의 코드는 없고 원형만 선언

추상 클래스의 목적
* 상속을 위한 슈퍼 클래스로 활용하는 것
* 서브 클래스에서 추상 메소드 구현
* 다형성 실현

### 인터페이스 구현
인터페이스의 추상 메소드를 모두 구현한 클래스 작성
* implements 키워드 사용
* 여러 개의 인터페이스 동시 구현 가능

### 자바의 패키지와 모듈이란?
패키지
* 서로 관련된 클래스와 인터페이스를 컴파일한 클래스 파일들을 묶어 놓은 디렉터리
* 하나의 응용프로그램은 한 개 이상의 패캐지로 작성
* 패키지는 jar 파일로 압축할 수 있음

자바 모듈화의 목적
* 자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위함
* 컴퓨터 시스템의 불필요함 감소


## 4월 12일
수업 내용

### 접근 지정자
자바의 접근 지정자 : private, protected, public, 디폴트  

목적 
* 클래스나 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용
* 객체 지향 언어의 캡슐화 정책은 멤버를 보호 하는 것

### final 클래스와 메소드
클래스 : 더 이상 클래스 상속 불가능  
메소드 : 더 이상 오버라이딩 불가능


### 슈퍼 클래스, 서브 클래스
슈퍼 클래스 객체와 서브 클래스의 객체는 별개, 서브 클래스 객체는 슈퍼 클래스 멤버 포함  

서브 클래스의 생성자는 실행 전 슈퍼 클래스 생성자 호출  

* 슈퍼 클래스와 서브 클래스
    * 각각 여러 개의 생성자 작성 가능

* 서브 클래스의 객체가 생성될 때
    * 슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개가 실행

서브 클래스의 생성자와 슈퍼 클래스의 생성자가 결정되는 방식
1. 개발자의 명시적 선택  
    * 서브 클래스 개발자가 슈퍼 클래스의 생성자 명시적 선택
    * super() 키워드를 이용하여 선택

2. 컴파일러가 기본생성자 선택
    * 서브 클래스 개발자가 슈퍼 클래스의 생성자를 선택하지 않는 경우
    * 컴파일러가 자동으로 슈퍼 클래스의 기본 생성자 선택


### 자바 상속의 특징
* 클래스 다중 상속 불허
    * c++는 다중 상송 가능
    * 자바는 인터페이스의 다중 상속 허용

* 모든 자바 클래스는 묵시적으로 object클래스 상속받음
    * java,lang,object 클래스는 모든 클래스의 슈퍼 클래스






## 4월 5일
수업 내용  

배열 리턴 : 배열의 레퍼런스만 리턴(배열 전체가 리턴되는 것이 아님)  

### 자바의 예외 처리
예외 : 실행 중 오동작이나 결과에 악영향을 미치는 예상치 못한 상황 발생  
실행 중 예외가 발생하면 : 자바 플랫폼은 응용프로그램이 예외를 처리하도록 호출  

### 자바의 객체 지향 특성
캡슐화  
* 캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것
    * 객체의 가장 본질적인 특징    

상속
* 상위 클래스 : 수퍼 클래스
* 하위 클래스 : 서브 클래스, 수퍼 클래스 코드의 재사용, 새로운 특성 추가 가능

다형성
* 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것
* 다형성 사례
    * 메소드 오버로딩 : 한 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드
    * 메소드 오버라이딩 : 슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스마다 다르게 구현  

### 클래스와 객체
클래스  
* class 키워드로 선언
* 멤버 : 클래스 구성요소 (필드와 메소드)
* 클래스에 대한 public 접근 지정 : 다른 모든 클래스에서 클래스 사용 허락
* 멤버에 대한 public 접근 지정 : 다른 몯느 클래스에게 멤버 접근 허용

### 생성자 개념과 목적
생성자
* 객체가 생성될 때 초기화 목적으로 실행되는 메소드
* 객체가 생성되는 순간에 자동 호출


## 3월 29일
수업 내용

### 변수

실수 리터럴 = double로 작성  
문자 리터럴 = 단일 인용부호, 특수문자는 \로 시작  
논리 리터럴 = true , false  
널   리터럴 = 레퍼런스에 대입 (null)  
스트링 리터럴 = 이중 인용부호로 묶어 표현 String str  

### 상수
* final 키워드 사용
* 선언 시 초깃값 지정
* 실행 중 값 변경 불가

var 키워드는 변수 선언 시 초깃값이 주어지지 않으면 컴파일 오류  

### 타입 변환
자동 타입 변환  
* 컴파일러에 의해 원래의 타입보다 큰 타입으로 자동 변환
* 치환문(=)이나 수식 내에서 타입이 일치하지 않을 때

강제 타입 변환
* 개발자의 의도적 타입 변환
* ()안에 개발자가 명시적으로 타입 변환 지정

### 연산
* 비교 연산자 : 두 개의 값을 비교하여 true/false 결과
* 논리 연산자 : 두 개의 논리 값에 논리 연산. 논리 결과
* 조건 연산 : 3개의 피연자로 구성된 삼항 연산자 opr1이 true면, 연산식결과는 opr2
false면 opr3
* 비트 연산
    * 비트 논리 연산 : 비트끼리 AND, OR, XOR, NOT 연산
    * 비트 시프트 연산 : 비트를 오른쪽이나 왼쪽으로 이동

### 조건문
단순 if문  
if-else문
다중 if문

### 자바 배열  
인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조  
0부터 시작  
인덱스는 배열의 시작 위치에서부터 데이터가 있는 상대 위치  
배열 객체의 length 필드 자바의 배열은 객체로 처리  
자바는 배열만 전달받음




## 3월 22일
수업 내용

1. java 프로젝트 자동 생성 후 실행(디버깅까지), src로 파일 옮기기
2. src에서 파일 생성 하면 자동으로 bin파일에 컴파일
3. 프로그래밍 언어 : 기계어, 어셈블리어, 고급 언어
4. 프로그램 플랫폼 호환성 없는 이유
      * 기계어가 CPU마다 다름  
      * 운영체제마다 API 다름  
      * 운영체제마다 실행파일 형식 다름  
<br><br>
### 5. **WORA** : 한번 작성된 코드는 모든 플랫폼에서 바로 실행되는 자바의 특징
 * **바이트 코드**  
    * 자바 소스를 컴파일한 목적 코드  
    * CPU에 종속적이지 않은 중립적인 코드  
    * JVM에 의해 해석되고 실행됨  
 * **JVM**
    * 자바 바이트 코드를 실행하는 자바 가상 기계
<br><br>
### 6. **JDK와 JRE**

   - **JDK** : 자바 응용 개발 환경, 개발에 필요한 도구 포함  
   - **JRE** : 자바 실행 환경, 개발자가 아닌 경우 JRE만 따로 다운 가능
<br><br>
### 7. **자바 API**    
 * 자바 API란?    
    * 주요한 기능들을 미리 구현한 클래스 라이브러리의 집합
    * API에서  정의한 규격에 따라 클래스 사용
    
 * 자바 패키지  
    * 서로 관련된 클래스들을 분류하여 묶어 놓은 것
    * 계층구조로 되어 있음
    * 자바API는 JDK에 패키지 형태로 제공됨
    * 개발자 자신의 패키지 생성 가능
<br><br>

### 자바 모바일 응용

* 서블릿 응용 프로그램
* 모바일 웹
#
### 자바의 특성(1)
* 플랫폼 독립성
    - 하드웨어, 운영체제에 종속되지 않는 바이트 코드로 플랫폼 독립성

* 객체지향
    - 캡슐화, 상속, 다형성 지원

* 클래스로 캡슐화
    - 자바의 모든 변수난 함수는 클래스 내에 선언
    - 클래스 안에서 클래스(내부 클래스) 작성 가능  

* 소스(.java)와 클래스(.class)파일
    - 하나의 소스 페일에 여러 클래스를 작성 가능
    - 소스 파일의 이름과 public으로 선언된 클래스 이름은 같아야 함
    - 클래스 파일에는 하나의 클래스만 존재
### 자바의 특성(2)
* 실행 코드 배포
    - 구성
    - 자바 응용프로그램의 실행은 main() 메소드에서 시작

* 패키지
    - 서로 관련 있는 여러 클래스를 패키지로 묶어 관리
    - 패키지는 폴더 개념

* 멀티스레드
    - 여러 스레드의 동시 수행 환경 지원

* 가비지 컬렉션
    - 자바 언어는 메모리 할당 기능은 있어도 메모리 반환 기능 없음
### 자바의 특성(3)
* 실시간 응용프로그램에 부적합
    - 실행 도중 예측할 수 없는 시점에 가비지 컬렉션 실행 때문
    
* 자바 프로그램은 안전
    - 타입 체크 엄격
    - 물리적 주소를 사용하는 포인터 개념 없음

* 프로그램 작성 쉬움
    - 포인터 개념이 없음
    - 동적 메모리 반환 하지 않음
    - 다양한 라이브러리 지원

* 실행 속도 개선을 위함 JIT 컴파일러 사용
    - 자바는 바이트 코드를 인터프리터 방식으로 실행
    - JIT 컴파일 기법으로 실행 속도 개선

### 식별자의 원칙
* @, #, !와 같은 특수 문자, 공백 또는 탭은 식별자X, _, $는 사용 가능
* 유니코드 문자 사용 가능. 한글 사용 가능
* 자바 언어의 키워드는 식별자로 사용불가
* 식별자의 첫 번째 문자로 숫자는 사용불가
* _ 또는 $를 식별자 첫 번째 문자로 사용할 수 있으나 원칙적으로 사용 하지 않음

### 자바의 데이터 타입
* 기본 타입(8개)
    - oolean
    - char
    - byte
    - short
    - int
    - long
    - float
    - double

## 3월 15일
내용

1.커밋방법
