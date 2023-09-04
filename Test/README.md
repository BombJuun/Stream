# Stream

정의

다양한 데이터 소스(컬렉션,배열)를 표준화된 방법으로 다루기 위한 것

JDK 1.8 전에는 List,Set(집합),Map(키와 값)

JDK 1.8부터는 스트림 등장으로 표준화가 가능하게 됨

컬렉션(List,Set,Map),배열 등의 데이터소스로 Stream을 만들 수 있다.

똑같은 방식으로 처리

# 작업 과정

1.Stream 생성

2.중간연산-연산결과가 스트림인 연산. 반복적으로 적용가능


중간연산 관련 메서드

distinct(): 중복제거

filter(): 원하는 기준으로 요소를 걸러내는 역할
            원하는 기준은 predicate형태를 매개값으로 준다.

limit(): 스트림의 일부를 잘라낸다

skip(): 스트림의 일부를 건너뛴다.

peek: 스트림의 요소에 작업을 수행

sorted():스트림의 요소를 정렬

map():스트림의 요소를 변환한다.




3.최종연산-연산결과가 스트림이 아닌 연산. 단 한번만 적용가능(스트림의 요소를 소모)


최종연산자 관련 메서드


forEach() :각 요소에 지정된 작업 수행

count(): 스트림의 요소의 개수 반환

max(),min(): 스트림의 최대/최소값을 반환

findAny():아무거나 하나

findFirst():첫번째 요소

collect(): 스트림을 컬렉션 형태로 반환

allMatch():주어진 조건을 모든 요소가 만족시키는지 확인

anyMatch():하날도 만족하는지

nonMatch():모두 만족하지 않는지

toArray():스트림의 요소를 배열로 반환

reduce():스트림의 요소를 하나씩 줄여가면서 계산

# 스트림 생성 방법

1.컬렉션으로 스트림 생성

Stream<Integer> stream=List.stream();

2.배열

Stream<String> strStream=Stream.of(new String{}{"a","b","c"});

3.숫자범위로 스트림 생성

IntStream stream=Instream.rangeClosed(1,100);

4.빈 스트림 생성

Stream<String> stream=Stream.empty();


5.람다식으로 스트림 생성-iterate()

Stream<Integer> lamStream=Stream.iterate(0,n->n+2);

6.람다식으로 스트림 생성-generate()

Stream<Double> randomStream=Stream.generate(Math::random);

# 스트림의 특징

스트림은 데이터소스(원본)로부터 데이터를 읽기만 할 뿐 변경하지 않는다.

예제소스 코드는 stream_point1.java

