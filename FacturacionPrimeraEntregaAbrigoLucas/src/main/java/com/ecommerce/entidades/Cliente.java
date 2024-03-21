package com.ecommerce.entidades;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.clasesabstractas.Persona;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "clientes")
public class Cliente extends Persona {
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	  	@Column(name = "Telefono")
	  	private Integer phone;
	  	@Column(name = "direccion")
		private String address;
	  	
	  	@OneToMany(mappedBy = "cliente")
	    private List<Venta> ventas = new ArrayList<>();
	  	
	  	
		// Constructor
	  	
	  	public Cliente () {
	    	super();
	    }
	  	
	    public Cliente (Integer dni, String name, String lastName, String email, Integer phone, String address) {
	    	super(dni, name, lastName, email);
	        this.phone = phone;
	        this.address = address;
	    }
	    
	    
	    public List<Venta> getVentas() {
	        return ventas;
	    }

	    public void setVentas(List<Venta> ventas) {
	        this.ventas = ventas;
	    }
	    
	    
		public Integer getPhone() {
			return phone;
		}

		public void setPhone(Integer phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		} 
	 
}
