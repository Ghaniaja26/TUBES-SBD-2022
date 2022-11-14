<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aplikasi Management Minimarket</title>
</head>
<body>
	<form action = "<%= request.getContextPath() %>/Menu" method ="post">
		<p> Aplikasi Management Minimarket
		<br>  =========================
		<br>  1. Tambahkan Data Pemasok
		<br>  2. Tambahkan Data Suplai
		<br>  3. Tambahkan Data Barang
		<br>  4. Buat Data Penjualan
		<br>  5. Lihat Daftar Pemasok
		<br>  6. Lihat Riwayat Pemasokan
		<br>  7. Lihat Riwayat Penjualan
		<br>  8. Lihat Daftar Barang
		<br>  ==========================
		<br> Input Menu : <input type="text" name="inputMenu">  <input type="submit" />
		<p>
	</form>
</body>
</html>

