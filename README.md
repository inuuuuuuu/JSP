# 20220998_SERVLET_JSP
## 인우파크 홈쇼핑 사이트 코딩
### 2주차 23/09/06
-프로젝트 환경 설정, HELLO WORLD 확인 완료,
-쇼핑몰 메인 페이지 [index.jsp 실행/수정 완료]

### 3주차 23/09/13
-쇼핑몰 메인 페이지 모듈화 4개
[top_banner.jsp/top_menu.jsp/body_main.jsp/footer.jsp]
![image](https://github.com/inuuuuuuu/JSP/assets/127916221/2322c6c1-3da8-4282-ab3e-decb09bfb0b7)

### 5주차 23/09/27
-쇼핑몰 상품 목록 페이지 추가
[dto/Product.java, dao/ProductRepository.java]

### 6주차 23/10/04
-쇼핑몰 상세 페이지 추가(Product_detail.jsp)
[dao/ProductRepository.java > getProductById() 추가 (상품과 일치하는 id 리턴)]
![image](https://github.com/inuuuuuuu/JSP/assets/127916221/5c3139ff-a4ad-4d4f-9cca-d2cead713a9c)

### 7주차 23/10/11
-쇼핑몰 상품 등록 추가[product_add_ad.jsp/product_add_process.jsp] 
-관리자 전용 폴더 생성

### 9주차 23/10/25
-쇼핑몰 이미지 업로드 추가
-쇼핑몰 입력값 필터링 추가[js/validation.js]
![image](https://github.com/inuuuuuuu/JSP/assets/127916221/fd4a08ff-0533-4592-8be7-c912a4fa82c4)

### 10주차 23/11/01
-쇼핑몰 로그인 기능 추가[login.jsp, login_failed.jsp, logout.jsp]
-탐켓 서버 내 .xml 파일 수정[WEB-INF/web.xml]
![image](https://github.com/inuuuuuuu/JSP/assets/127916221/df8923a6-1f9b-4266-9bbb-b73a34e2dda0)

### 11주차 23/11/08
-세션 및 장바구니 기능 추가[product_cart.jsp, product_cart_add.jsp, product_cart_remove.jsp, product_cart_remove_all.jsp] 
![image](https://github.com/inuuuuuuu/JSP/assets/127916221/a426508b-3357-4cce-b8f2-ef88b499cff1)


### 12주차 23/11/15
-쇼핑몰 주문 처리 페이지 추가
![image](https://github.com/inuuuuuuu/JSP/assets/127916221/8516fc48-d62b-4eca-b2dc-86eb4bba5adc)
-도전문제1 : 배송일을 날짜를 선택하여 입력하도록 수정 O
    날짜 라이브러리 사용, 오늘날짜 불러오고 +1하여 저장(다음날 날짜 지정), min값에 대입

<img width="480" alt="배송정보_도전문제" src="https://github.com/inuuuuuuu/JSP/assets/127916221/4043495c-b3da-4405-adcd-ccaf1f71d20a">
