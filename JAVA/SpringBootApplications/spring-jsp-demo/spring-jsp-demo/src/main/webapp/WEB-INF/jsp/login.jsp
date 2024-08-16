<html>

	<head>
		<title>Login Page</title>
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
			
	            <div class="alert" role="alert">${errorMsg}</div>
	        
		
			<div class="container-fluid">
				<form method="post">
					<input type="text" name="userId" class="form-control mt-3" placeholder="User ID"/>
					<input type="password" name="password" class="form-control mt-3" placeholder="Password"/>
					<button type="submit" class="btn">Login</button>
					
					<div class="mt-3">
						<a href="/register" class="btn btn-success btn-block mt-3" id="btnRegister">Register</a>
					</div>
				</form>
			</div>	
		</div>
	</body>

</html>