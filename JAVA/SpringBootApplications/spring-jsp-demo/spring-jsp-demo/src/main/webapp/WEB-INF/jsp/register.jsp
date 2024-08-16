<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>

	<head>
		<title>Register Page</title>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
		<style>
			.login-form {
				width: 400px;
				height: 260px;
				position: absolute;
				background-color: #5B5EA6;
				border-radius: 20px;
				top: 50%;
				left: 50%;
				margin-right: -50%;
				transform: translate(-50%, -50%);
			}
			
			.btn {
				width: 100%;
				color: white;
				height: 40px;
				background-color: #050a30;
				margin-top: 10px;
				border-radius: 10px;	
			}
			
			#btnRegister {
				position: relative;
				top: -20px
			}
			
		</style>
	</head>
	
	<body>
		<div class="login-form">
			
	            <div class="alert" role="alert">${successMsg}</div>
	        
		
			<div class="container-fluid">
				<form:form method="post" modelAttribute="user">
					<form:input type="text" path="userId" class="form-control mt-3" placeholder="User ID"/>
					<form:input type="password" path="password" class="form-control mt-3" placeholder="Password"/>
					<form:button class="btn">Register</form:button>
					
				</form:form>
			</div>	
		</div>
	</body>

</html>