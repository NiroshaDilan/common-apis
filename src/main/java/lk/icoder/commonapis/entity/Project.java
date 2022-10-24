package lk.icoder.commonapis.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
public class Project extends AuditEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_alias")
    private String projectAlias;

    @Column(name = "project_name")
    private String projectName;

    @ManyToMany(fetch = FetchType.LAZY,
        cascade = {
            CascadeType.PERSIST,
                CascadeType.MERGE
        }, mappedBy = "projects")
    @JsonIgnore
    private Set<Dealer> dealers = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "project_staff",
            joinColumns = { @JoinColumn(name = "project_id")},
            inverseJoinColumns = { @JoinColumn(name = "staff_id")})
    private Set<Staff> staffs = new HashSet<>();
}
