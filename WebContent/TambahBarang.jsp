<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tambah Data Barang </title>
</head>
<body>
	<div align = "center">
		<h1>Masukan Data Barang</h1>
		<form action = "<%= request.getContextPath() %>/TambahBarang" method ="post">
			<table style = "with : 80%">
				<tr>
					<td>Nama Barang</td>
					<td><input type = "text" name="namaBarang" /></td>
				</tr>
				<tr>
					<td>Harga Jual</td>
					<td><input type = "text" name="hargaJual" /></td>
				</tr>
				<tr>
					<td>Brand</td>
					<td><input type = "text" name="brand" /></td>
				</tr>
				<tr>
					<td>Jenis Barang</td>
					<td><input type = "text" name="jenisBarang" /></td>
				</tr>
				<tr>
					<td>Stok Barang</td>
					<td><input type = "text" name="stokBarang" /></td>
				</tr>
				<tr>
					<td>No Suplai</td>
					<td><input type = "text" name="noSuplai" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>