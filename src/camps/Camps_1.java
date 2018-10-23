/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camps;

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
@Table(name = "Camps", catalog = "PUBLIC", schema = "")
@NamedQueries({
    @NamedQuery(name = "Camps_1.findAll", query = "SELECT c FROM Camps_1 c")
    , @NamedQuery(name = "Camps_1.findById", query = "SELECT c FROM Camps_1 c WHERE c.id = :id")
    , @NamedQuery(name = "Camps_1.findByCamparea", query = "SELECT c FROM Camps_1 c WHERE c.camparea = :camparea")
    , @NamedQuery(name = "Camps_1.findByVenue", query = "SELECT c FROM Camps_1 c WHERE c.venue = :venue")
    , @NamedQuery(name = "Camps_1.findByTime", query = "SELECT c FROM Camps_1 c WHERE c.time = :time")
    , @NamedQuery(name = "Camps_1.findByDate", query = "SELECT c FROM Camps_1 c WHERE c.date = :date")
    , @NamedQuery(name = "Camps_1.findByUnit", query = "SELECT c FROM Camps_1 c WHERE c.unit = :unit")})
public class Camps_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Camparea")
    private String camparea;
    @Column(name = "Venue")
    private String venue;
    @Column(name = "Time")
    private String time;
    @Column(name = "Date")
    private String date;
    @Column(name = "Unit")
    private String unit;

    public Camps_1() {
    }

    public Camps_1(Integer id) {
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

    public String getCamparea() {
        return camparea;
    }

    public void setCamparea(String camparea) {
        String oldCamparea = this.camparea;
        this.camparea = camparea;
        changeSupport.firePropertyChange("camparea", oldCamparea, camparea);
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        String oldVenue = this.venue;
        this.venue = venue;
        changeSupport.firePropertyChange("venue", oldVenue, venue);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        String oldUnit = this.unit;
        this.unit = unit;
        changeSupport.firePropertyChange("unit", oldUnit, unit);
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
        if (!(object instanceof Camps_1)) {
            return false;
        }
        Camps_1 other = (Camps_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "camps.Camps_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
