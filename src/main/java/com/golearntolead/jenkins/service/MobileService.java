package com.golearntolead.jenkins.service;

import com.golearntolead.jenkins.entity.Mobile;

import java.util.List;

public interface MobileService {
    List<Mobile> fetchAllAvailableMobiles();

    Mobile fetchById(Integer mobileId);

    String createMobile(Mobile mobile);
}
