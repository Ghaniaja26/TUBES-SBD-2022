package model;

public class Barang {
	public String getNamaBarang() {
		return namaBarang;
	}
	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}
	public double getHargaJual() {
		return hargaJual;
	}
	public void setHargaJual(double hargaJual) {
		this.hargaJual = hargaJual;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getJenisBarang() {
		return jenisBarang;
	}
	public void setJenisBarang(String jenisBarang) {
		this.jenisBarang = jenisBarang;
	}
	public int getStokBarang() {
		return stokBarang;
	}
	public void setStokBarang(int stokBarang) {
		this.stokBarang = stokBarang;
	}
	public String getNoSuplai() {
		return noSuplai;
	}
	public void setNoSuplai(String noSuplai) {
		this.noSuplai = noSuplai;
	}
	
	private String namaBarang;
	private double hargaJual;
	private String brand;
	private String jenisBarang;
	private int stokBarang;
	private String noSuplai;

}
