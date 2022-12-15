package com.golearntolead.jenkins.repository;

import com.golearntolead.jenkins.entity.Mobile;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MobileRepository {

    List<Mobile> listOfMobileData = new ArrayList<>();
    public List<Mobile> presentData(){
        if(listOfMobileData.isEmpty()){
            listOfMobileData.add(new Mobile(101, "iphone", "11", 1, 800));
            listOfMobileData.add(new Mobile(102, "iphone", "12", 1, 900));
        }
        System.out.println("listOfMobileData : " + listOfMobileData);
        return listOfMobileData;
    }

    public Mobile fetchById(Integer mobileId){
        Mobile mobile = listOfMobileData.stream()
                .filter(mb -> mb.getMobileId() == mobileId)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("There are no mobiles with the given id"));
        return mobile;
    }

    public String save(Mobile mobile) {
        listOfMobileData.add(mobile);
        return "The data of new mobile has been added";
    }

}
