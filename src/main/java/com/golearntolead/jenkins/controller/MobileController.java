package com.golearntolead.jenkins.controller;

import com.golearntolead.jenkins.entity.Mobile;
import com.golearntolead.jenkins.service.MobileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mobile")
@RequiredArgsConstructor
public class MobileController {

    @Qualifier("msi1")
    private final MobileService mobileService;

    @GetMapping
    public List<Mobile> fetchAllAvailableMobiles(){
        return mobileService.fetchAllAvailableMobiles();
    }

    @GetMapping("/{mobileId}")
    public Mobile fetchById(@PathVariable("mobileId") Integer mobileId){
        return mobileService.fetchById(mobileId);
    }

    @PostMapping
    public String createMobile(@RequestBody Mobile mobile){
        return mobileService.createMobile(mobile);
    }
}
