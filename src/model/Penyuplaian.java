package model;

public class Penyuplaian {
	public String getIdPemasok() {
		return idPemasok;
	}
	public void setIdPemasok(String idPemasok) {
		this.idPemasok = idPemasok;
	}
	public int getJumlahSuplai() {
		return jumlahSuplai;
	}
	public void setJumlahSuplai(int jumlahSuplai) {
		this.jumlahSuplai = jumlahSuplai;
	}
	public double getHargaSuplai() {
		return hargaSuplai;
	}
	public void setHargaSuplai(double hargaSuplai) {
		this.hargaSuplai = hargaSuplai;
	}
	public double getTotalHargaSuplai() {
		return totalHargaSuplai;
	}
	public void setTotalHargaSuplai(double totalHargaSuplai) {
		this.totalHargaSuplai = totalHargaSuplai;
	}
	private String idPemasok;
	private int jumlahSuplai;
	private double hargaSuplai;
	private double totalHargaSuplai;
	
}
