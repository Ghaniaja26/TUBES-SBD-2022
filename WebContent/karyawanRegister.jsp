<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale1.0">
    <title>Registrasi Karyawan Maksimarket</title>
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
                    <li><a href="index.jsp">Masuk</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="wrapper">
        <!-- Laman Log In -->
        <section id="login">
            <img src="https://img.freepik.com/free-vector/businessman-holding-pencil-big-complete-checklist-with-tick-marks_1150-35019.jpg?size=626&ext=jpg&ga=GA1.2.774943303.1667998427&semt=sph"/>
            <div class="classlogin">
                <p class="regis">Silahkan Registrasi</p>
                <p>Khusus Admin dan Pemasok</p>
                <form action = "<%= request.getContextPath() %>/register" method ="post">
	               <tr>
	                   <p>
	                        <td><input type = "radio"  name="posisi" value = "kasir"></td>
	                        <label for = "Kasir">Kasir</label>
	                        <td><input type = "radio" name="posisi" value = "pemasok"></td>
	                        <label for = "Pemasok">Pemasok</label>
	                   </p>
	                </tr>
	                <input type="Text" name = "nama" placeholder="Nama">
	                <h2>
		                <input type="Text" name = "username" placeholder="Username">
		                <input type="password" name = "password" placeholder="Kata Sandi">
		                <input type="Text" name = "alamat" placeholder="Alamat">
		                <input type="Text" name = "telepon" placeholder="No. Telp">
	                </h2>
	                <button>Daftar</button>
	            </form>
            </div>
        </section>
    </div>

</body>
</html>