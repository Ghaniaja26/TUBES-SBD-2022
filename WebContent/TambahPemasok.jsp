<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tambah Data Pemasok </title>
</head>
<body>
	<div align = "center">
		<h1>Masukan Data Pemasok</h1>
		<form action = "<%= request.getContextPath() %>/TambahDataPemasok" method ="post">
			<table style = "with : 80%">
				<tr>
					<td>Nama Pemasok</td>
					<td><input type = "text" name="namaPemasok" /></td>
				</tr>
				<tr>
					<td>Alamat</td>
					<td><input type = "text" name="alamatPemasok" /></td>
				</tr>
				<tr>
					<td>Telepon</td>
					<td><input type = "text" name="telpPemasok" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>