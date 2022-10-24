package lk.icoder.commonapis.repository;

import lk.icoder.commonapis.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DealerRepository extends JpaRepository<Dealer, Long> {

    List<Dealer> findDealerByProjectId(Long projectId);
}
