package lk.icoder.commonapis.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "dealer")
@Data
@NoArgsConstructor
public class Dealer extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dealer_code")
    private String dealerCode;

    @Column(name = "dealer_name")
    private String dealerName;

    @ManyToMany(fetch = FetchType.LAZY,
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
    @JoinTable(name = "dealer_project",
        joinColumns = { @JoinColumn(name = "dealer_id")},
        inverseJoinColumns = { @JoinColumn(name = "project_id")})
    private Set<Project> projects = new HashSet<>();

    public void addProject(Project project) {
        this.projects.add(project);
        project.getDealers().add(this);
    }

    public void removeProject(Long projectId) {
        Project project =  this.projects.stream()
                .filter(p -> p.getId() == projectId)
                .findFirst()
                .orElse(null);
        if (project != null) {
            this.projects.remove(project);
            project.getDealers().remove(this);
        }
    }
}
