package com.dede.first;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table( name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"}),@UniqueConstraint(columnNames = {"email"})}) 
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id", length=10, nullable=false, unique=true)
	private int ID_USER;
	
	@Column(name="username", length=10, nullable=false)
	private String username;
	
	@Column(name="nome", length=30, nullable=false)
	private String nome;
	
	@Column(name="cognome", length=30, nullable=false)
	private String cognome;
	
	@Column(name="email", length=50, nullable=false)
	private String email;
	
	@Column(name="pwd", length=30, nullable=false)
	private String pwd;
	
	
	
	

	
	public User() {}
	
	public User(String u, String n, String c, String e, String p) {
		username=u;
		nome=n;
		cognome=c;
		email=e;
		pwd=p;
	}
	
	public int getID_USER() {
		return ID_USER;
	}
	
	public void setID_USER(int k){
		ID_USER=k;
	}

	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pass){
		pwd=pass;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

}
