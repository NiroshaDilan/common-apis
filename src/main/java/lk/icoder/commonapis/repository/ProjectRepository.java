package lk.icoder.commonapis.repository;

import lk.icoder.commonapis.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findProjectByDealerId(Long dealerId);

    List<Project> findProjectByStaffId(Long staffId);
}
