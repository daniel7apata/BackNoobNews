package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Interaction")
public class Interaction {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInteraction;
    @Column(name = "dateInteraction", nullable = false)
    private LocalDate dateInteraction;
    @Column(name = "timeInteraction", nullable = false)
    private LocalTime timeInteraction;
    @Column(name = "liked", nullable = false)
    private boolean liked;
    @Column(name = "shared", nullable = false)
    private boolean shared;
    @Column(name = "comment", nullable = false, length = 200)
    private String comment;

    @ManyToOne
    @JoinColumn(name = "id_publication")
    private Publication publication;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users user;

    //Constructor
    public Interaction() {
    }

    public Interaction(int idInteraction, LocalDate dateInteraction, LocalTime timeInteraction, boolean liked, boolean shared, String comment, Publication publication, Users user) {
        this.idInteraction = idInteraction;
        this.dateInteraction = dateInteraction;
        this.timeInteraction = timeInteraction;
        this.liked = liked;
        this.shared = shared;
        this.comment = comment;
        this.publication = publication;
        this.user = user;
    }

    public int getIdInteraction() {
        return idInteraction;
    }

    public void setIdInteraction(int idInteraction) {
        this.idInteraction = idInteraction;
    }

    public LocalDate getDateInteraction() {
        return dateInteraction;
    }

    public void setDateInteraction(LocalDate dateInteraction) {
        this.dateInteraction = dateInteraction;
    }

    public LocalTime getTimeInteraction() {
        return timeInteraction;
    }

    public void setTimeInteraction(LocalTime timeInteraction) {
        this.timeInteraction = timeInteraction;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}