package model;

import java.util.Objects;

public class Tinh {
	private int maTinh; 
	private String tenTinh;
	
	//constructor de tao doi tuong Tinh()
	public Tinh(int maTinh, String tenTinh) { 
		this.maTinh = maTinh;
		this.tenTinh = tenTinh;
	}

	//getters setters de lay du lieu hoac gan du lieu
	public int getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

	//Ham de lay chuoi lien quan den Tinh in ra
	@Override
	public String toString() {
		return "Tinh [maTinh=" + maTinh + ", tenTinh=" + tenTinh + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maTinh, tenTinh);
	}

	//Ham so sanh 2 doi tuong 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tinh other = (Tinh) obj;
		return maTinh == other.maTinh && Objects.equals(tenTinh, other.tenTinh);
	} 
	
}
