package lk.icoder.commonapis.service.impl;

import lk.icoder.commonapis.entity.Staff;
import lk.icoder.commonapis.repository.StaffRepository;
import lk.icoder.commonapis.service.StaffService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    private final StaffRepository staffRepository;

    public StaffServiceImpl(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public List<Staff> findAll() {
        return null;
    }

    @Override
    public Staff findById(Long id) {
        return null;
    }

    @Override
    public Staff save(Staff staff) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
