package com.golearntolead.jenkins.service;

import com.golearntolead.jenkins.entity.Mobile;
import com.golearntolead.jenkins.repository.MobileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("msi1")
@RequiredArgsConstructor
public class MobileServiceImpl implements MobileService{

    private final MobileRepository mobileRepository;

    @Override
    public List<Mobile> fetchAllAvailableMobiles() {
        return mobileRepository.presentData();
    }

    @Override
    public Mobile fetchById(Integer mobileId) {
        return mobileRepository.fetchById(mobileId);
    }

    @Override
    public String createMobile(Mobile mobile) {
        return mobileRepository.save(mobile);
    }
}
