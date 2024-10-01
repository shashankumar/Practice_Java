<!DOCTYPE html>
<html lang="en">

    <head >
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Details Form</title>
    <link rel="stylesheet" href="style.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    </head>

    <body>
        <div class="wrapper">
            <form action="./InsertServlet" method="post">
                <h1>Student Details Form</h1>
                <div class="input-box">
                    <input type="text" placeholder="Student_ID" name="sid" required>
                    <i class='bx bxs-user'></i>
                </div>
                <div class="input-box">
                    <input type="text" placeholder="Library_ID" name="lid" required>
                    <i class='bx bxs-user'></i>
                </div>
                 <div class="input-box">
                    <input type="text" placeholder="Name"  name="name" required>
                    <i class='bx bxs-user'></i>
                </div>
                <div class="input-box">
                    <input type="text" placeholder="City" name="city" required>
                    <i class='bx bxs-user'></i>
                </div>
                <div class="remember-me">
                    <label> <input type="checkbox">Remember Me</label>
                    <a href="#">Forgot Password</a>
                </div>
                <button type="submit" class="btn">Save Details</button>
                
                <div class="register-link">
                    <p>Don't have account?<a href="http://localhost:8080/ServletInsertSelectApp/ShowServlet">Show Tables Details</a></p>
                </div>
            </form>
           
        </div>

    </body>
</html>