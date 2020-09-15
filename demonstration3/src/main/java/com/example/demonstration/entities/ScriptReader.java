package com.example.demonstration.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class ScriptReader implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@OneToOne
	private Texte texte ;
	
	@OneToOne
	private User user;
	
	private Date viewDate;
	
	private Date updateDate;
	
	private String personification;
	
	private String comment;
	
	private Byte note;

	public Byte getNote() {
		return note;
	}

	public void setNote(Byte note) {
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Texte getTexte() {
		return texte;
	}

	public void setTexte(Texte texte) {
		this.texte = texte;
	}
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getViewDate() {
		return viewDate;
	}

	public void setViewDate(Date viewDate) {
		this.viewDate = viewDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getPersonification() {
		return personification;
	}

	public void setPersonification(String personification) {
		this.personification = personification;
	}

	public ScriptReader() {
		
	}

	public ScriptReader(Long id, Texte texte, User user, Date viewDate, Date updateDate, String personification) {
		super();
		this.id = id;
		this.texte = texte;
		this.user = user;
		this.viewDate = viewDate;
		this.updateDate = updateDate;
		this.personification = personification;
	}
    
	
	

}
