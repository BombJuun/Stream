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

3.최종연산-연산결과가 스트림이 아닌 연산. 단 한번만 적용가능(스트림의 요소를 소모)

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
