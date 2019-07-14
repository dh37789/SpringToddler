<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="button" class="btn-info" value="hello"> 안녕하시오
	오명학페이지에오 ${test }
	Commit test입니다.
	<div class="app">{{ message }}</div>
	
</body>
<script src="https://unpkg.com/vue@2.3.3"></script>
    <script type="text/javascript">
        new Vue({
            el : '.app',
            data : {
                message : '안녕 난 전역자 오명학이다!!!!!!!!!!!'
            }
        })
</script>
</html>
