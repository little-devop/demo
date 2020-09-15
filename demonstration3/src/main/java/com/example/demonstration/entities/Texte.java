package com.example.demonstration.entities;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.transaction.annotation.Transactional;


@Entity
@Transactional
public class Texte implements Serializable {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Texte() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "titre", unique = true)
    private String titre;

	@Column
    private String theme;
    
    @Column(length = 10000)
    private String contenu;
   
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    
    @ManyToOne
    private User author;
    
    private int nbDeMot;

    private String personnages; // {"pers1":"xxx", .....
    
    
    public User getAuthor() {
    	return author;
    }


    public void setAuthor(User author) {
    	this.author = author;
    }

    
  
    
    public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	public String getPersonnages() {
		return personnages;
	}


	public void setPersonnages(String personnages) {
		this.personnages = personnages;
	}


	public void setId(Long id) {
		this.id = id;
	}

    
    
    public Texte(String titre, String theme, String contenu, Date dateCreation,
			String personnages, User author) {
		super();
		this.titre = titre;
		this.theme = theme;
		this.contenu = contenu;
		this.dateCreation = dateCreation;
		this.nbDeMot = this.contenu.length();
		this.personnages = personnages;
		this.author = author;
		
	}


	


	public Texte(String title, String theme, String contenu) {
    	this.titre = title;
    	this.contenu = contenu;
    	this.nbDeMot = contenu.length();
    }
   

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getNbDeMot() {
        return nbDeMot;
    }

    public void setNbDeMot(int nbDeMot) {
        this.nbDeMot = nbDeMot;
    }

    public Long getId() {
        return id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    
    public String toString1() {
        return String.format(
            "Customer[id=%d, theme='%s', contenu='%s',user='%s']",
            id,theme, titre, contenu);
      }
    


	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Texte)) {
            return false;
        }
        Texte other = (Texte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atelier.entity.Livre[ id=" + id + " ]";
    }
    
}
