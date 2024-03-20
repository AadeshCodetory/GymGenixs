package com.gymgenixs.service;

import com.google.gson.Gson;
import com.gymgenixs.dao.PlanDao;
import com.gymgenixs.entity.Plan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlanService {
    @Autowired
    PlanDao planDao;

    Gson gson = new Gson();

    public Plan addPlan(String planStringDetails){

        log.info("Data received {}", planStringDetails);
        Plan plan = gson.fromJson(planStringDetails, Plan.class);
        log.info("data -> "+gson.toJson(plan));
        return planDao.save(plan);
    }

    public List<Plan> getAllPlan(){
        return planDao.findAll();
    }

    public void deletePlan(long id){
        planDao.deleteById(id);
//        planDao.delete();
    }
}
