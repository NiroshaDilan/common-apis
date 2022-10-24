package lk.icoder.commonapis.service.impl;

import lk.icoder.commonapis.entity.Dealer;
import lk.icoder.commonapis.exception.ResourceNotFoundException;
import lk.icoder.commonapis.repository.DealerRepository;
import lk.icoder.commonapis.service.DealerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealerServiceImpl implements DealerService {

    private final DealerRepository dealerRepository;

    public DealerServiceImpl(DealerRepository dealerRepository) {
        this.dealerRepository = dealerRepository;
    }

    @Override
    public List<Dealer> findAll() {
        return dealerRepository.findAll();
    }

    @Override
    public Dealer findById(Long id) {
        return dealerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));
    }

    @Override
    public Dealer save(Dealer dealer) {
        return dealerRepository.save(dealer);
    }

    @Override
    public void deleteById(Long id) {
        dealerRepository.deleteById(id);
    }
}
