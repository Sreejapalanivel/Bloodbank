/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banktable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author elcot
 */
@Entity
@Table(name = "BloodBanks", catalog = "PUBLIC", schema = "")
@NamedQueries({
    @NamedQuery(name = "BloodBanks.findAll", query = "SELECT b FROM BloodBanks b")
    , @NamedQuery(name = "BloodBanks.findById", query = "SELECT b FROM BloodBanks b WHERE b.id = :id")
    , @NamedQuery(name = "BloodBanks.findByBankname", query = "SELECT b FROM BloodBanks b WHERE b.bankname = :bankname")
    , @NamedQuery(name = "BloodBanks.findByHospital", query = "SELECT b FROM BloodBanks b WHERE b.hospital = :hospital")
    , @NamedQuery(name = "BloodBanks.findByAddress", query = "SELECT b FROM BloodBanks b WHERE b.address = :address")
    , @NamedQuery(name = "BloodBanks.findByContact", query = "SELECT b FROM BloodBanks b WHERE b.contact = :contact")
    , @NamedQuery(name = "BloodBanks.findByEmail", query = "SELECT b FROM BloodBanks b WHERE b.email = :email")
    , @NamedQuery(name = "BloodBanks.findByWebsite", query = "SELECT b FROM BloodBanks b WHERE b.website = :website")})
public class BloodBanks implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "BANKNAME")
    private String bankname;
    @Column(name = "HOSPITAL")
    private String hospital;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "Website")
    private String website;

    public BloodBanks() {
    }

    public BloodBanks(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        String oldBankname = this.bankname;
        this.bankname = bankname;
        changeSupport.firePropertyChange("bankname", oldBankname, bankname);
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        String oldHospital = this.hospital;
        this.hospital = hospital;
        changeSupport.firePropertyChange("hospital", oldHospital, hospital);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        String oldWebsite = this.website;
        this.website = website;
        changeSupport.firePropertyChange("website", oldWebsite, website);
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
        if (!(object instanceof BloodBanks)) {
            return false;
        }
        BloodBanks other = (BloodBanks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banktable.BloodBanks[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
