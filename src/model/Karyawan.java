package model;

public class Karyawan {	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getTelp() {
		return telp;
	}
	public void setTelp(String telp) {
		this.telp = telp;
	}
	public String getPosisi_karyawan() {
		return posisi_karyawan;
	}
	public void setPosisi_karyawan(String posisi_karyawan) {
		this.posisi_karyawan = posisi_karyawan;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private String nama;
	private String alamat;
	private String telp;
	private String posisi_karyawan;
	private String username;
	private String password;
	
}
