<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale1.0">
    <title>Laman Log In Karyawan Maksimarket</title>
    <link rel="stylesheet" href="style.css">
    <link rel="shortcut icon" href="fgr.png">
</head>
<body>
    <nav>
        <div class="wrapper">
        
            <div class="logo"><a href=''>Maksimarket's Admin</a></div>
            <div class="menulogin">
                <ul>
                    <li><a href="perobaan.html">Home</a></li>
                    <li><a href="karyawanRegister.jsp">Registrasi</a></li>
                </ul>
            </div>
        </div>
      
    </nav>

    <div class="wrapper">
        <!-- Laman Log In -->
        <section id="login">
            <img src="https://img.freepik.com/free-vector/global-data-security-personal-data-security-cyber-data-security-online-concept-illustration-internet-security-information-privacy-protection_1150-37355.jpg?size=626&ext=jpg&ga=GA1.2.774943303.1667998427&semt=sph"/>
            <div class="classlogin">
                <p class="deskripsi">Silahkan Masuk</p>
                <p>Khusus Kasir dan Pemasok</p>
                <form action = "<%= request.getContextPath() %>/Login" method ="post">
	                <input type="Text" name="username" placeholder="Username">
	                <h2>
	                <input type="password" name="password" placeholder="Kata Sandi">
	                </h2>
	                <button>Masuk</button>
	            </form>
            </div>
        </section>
    </div>
</body>
</html>