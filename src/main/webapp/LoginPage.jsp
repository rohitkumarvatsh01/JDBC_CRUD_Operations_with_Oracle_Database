<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>   
<html>   
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<title> Login Page </title>  
<style>   
	Body {
		display: flex;
  		justify-content: center;
  		background-color: pink;  
	}  
	button {   
       background-color: #4CAF50;   
       width: 100%;  
        color: black;   
        padding: 15px;   
        margin: 10px 0px;   
        border: 2px solid black;  
        cursor: pointer;   
     }   
 	 form {   
        border: 3px solid #f1f1f1;   
      }   
 	input[type=text], input[type=password] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid black;   
        box-sizing: border-box;   
    }       
 	.container {   
        padding: 25px;   
        background-color: lightblue;  
    } 
    #heading{
    	display: flex;
  		justify-content: center;
    }  
</style>   
</head>    
<body>  
    <form action="LoginServlet" method="post">  
        <div class="container"> 
        <h1 id="heading"> User Login Form </h1>  
            <label>Username : </label>   
            <input type="text" placeholder="Enter Username" name="username" required>  
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="password" required>  
            <button type="submit">Login</button>
            <button type="submit"><a href="SignupPage.jsp"> Sign up </a></button>
        </div>   
    </form>     
</body>     
</html>