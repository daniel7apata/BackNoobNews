package pe.edu.upc.aaw.demo01.entities;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="Publication")
public class Publication {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublication;
    @Column(name = "headline",nullable = false,length = 250)
    private  String headline;
    @Column(name = "lead",nullable = false,length = 250)
    private String lead;
    @Column(name = "body",nullable = false,length = 4500)
    private String body;
    @Column(name = "attachedFile",length = 200)
    private String attachedFile;
    @Column(name = "datePublication",nullable = false)
    private LocalDate datePublication;
    @Column(name = "popular",nullable = false)
    private boolean popular;

    @ManyToOne
    @JoinColumn(name = "id_logicuser")
    private LogicUser logicUser;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    //Constructor
    public Publication() {
    }

    public Publication(int idPublication, String headline, String lead, String body, String attachedFile, LocalDate datePublication, boolean popular, LogicUser logicUser, Category category) {
        this.idPublication = idPublication;
        this.headline = headline;
        this.lead = lead;
        this.body = body;
        this.attachedFile = attachedFile;
        this.datePublication = datePublication;
        this.popular = popular;
        this.logicUser = logicUser;
        this.category = category;
    }

    public int getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(int idPublication) {
        this.idPublication = idPublication;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttachedFile() {
        return attachedFile;
    }

    public void setAttachedFile(String attachedFile) {
        this.attachedFile = attachedFile;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public LogicUser getLogicUser() {
        return logicUser;
    }

    public void setLogicUser(LogicUser logicUser) {
        this.logicUser = logicUser;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
