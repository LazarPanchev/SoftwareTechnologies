package lognoziroh.entity;

import javax.persistence.*;

@Entity
@Table(name = "reports")
public class Report {
//    id – technology-dependent identifier (ObjectID for JavaScript, int for all other technologies)
// status – non-empty text (will either be “Normal”, “Warning” or “Critical”).
//             message – non-empty text
// origin – non-empty text

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String status;

    @Column
    private String message;

    @Column
    private String origin;

    public Report() {
    }

    public Report(String status, String message, String origin) {
        this.status = status;
        this.message = message;
        this.origin = origin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
