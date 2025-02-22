package pro.coworking.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int capacity;

    @OneToMany(mappedBy = "space")
    private List<Reservation> reservations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Space() {
    }

    public Space(Long id, String name, String location, int capacity, List<Reservation> reservations) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.reservations = reservations;
    }

    
}