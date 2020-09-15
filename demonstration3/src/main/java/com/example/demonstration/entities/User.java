package com.example.demonstration.entities;


import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import com.example.demonstration.constants.UserType;


@Entity
@Transactional
public class User implements Serializable, UserDetails {

	public User() {
		super();
	
	}


	private static final long serialVersionUID = 1L;
@Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private Date birthDate;
  private String password;
  private String pseudo;
  private String nationality;
  private String adresse;
  private UserType userType;
  private String email;
 
  private String username;
  
  @OneToMany(fetch = FetchType.EAGER, mappedBy = "author")
  private List<Texte> texts;
  private Long nbTextelu;
  
  public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public void setUserName(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password =  password;
}

public String getNationality() {
	return nationality;
}


public void setNationality(String nationality) {
	this.nationality = nationality;
}


public UserType getUserType() {
	return userType;
}


public void setUserType(UserType userType) {
	this.userType = userType;
}


public Long getNbTextelu() {
	return nbTextelu;
}


public void setNbTextelu(Long nbTextelu) {
	this.nbTextelu = nbTextelu;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
public String getFirstName() {
	return firstName;
}

  public User(String firstName, String lastName, Date birthDate, String password, String pseudo,
		String nationality, String adresse, UserType userType, Long nbTextelu,  String email) {
	super();
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthDate = birthDate;
	this.password = password;
	this.pseudo = pseudo;
	this.nationality = nationality;
	this.adresse = adresse;
	this.userType = userType;
	this.nbTextelu = nbTextelu;
	this.email = email;
}

public String getPseudo() {
	return pseudo;
}
public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}
public String getNatrionality() {
	return nationality;
}
public void setNatrionality(String natrionality) {
	this.nationality = natrionality;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public void setId(Long id) {
	this.id = id;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/*
public User(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }*/

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%d, firstName='%s', lastName='%s']",
        id, firstName, lastName);
  }
 /* @Override
  public String toString1() {
	  return String.format(pseudo,password,adresse);
  }
 */
  public Long getId() {
    return id;
  }


  public String getLastName() {
    return lastName;
  }


@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public String getUsername() {
	// TODO Auto-generated method stub
	return this.username;
}


@Override
public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean isEnabled() {
	// TODO Auto-generated method stub
	return false;
}


}