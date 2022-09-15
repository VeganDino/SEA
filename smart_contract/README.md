# Smart Contract

**과정 정리**
\1. 솔리디티 파일 생성
`truffle create contract [파일명]`
\2. 솔리디티 파일 컴파일하기
`truffle compile`
build/contracts [파일명].json 생성되는 것 확인
\3. 마이그레이션 코드 작성하기
migrations 폴더 안에서 파일 생성
파일명의 규칙은 `[숫자]_[파일명].js`
`truffle migrate`
\4. 테스트 작업
테스트 파일 생성하기
`truffle create test [파일명]`
이후 코드 작성하기
`truffle test`를 통해 테스트 결과를 확인할 수 있다.
