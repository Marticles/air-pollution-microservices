package com.marticles.microservice.airpollution.demo.service;

import com.marticles.microservice.airpollution.demo.model.Site;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Marticles
 * @description SitesService
 * @date 2019/1/14
 */
@FeignClient("microservice-airpollution-sites-server")
public interface SitesService {

    @GetMapping("/api/sites")
    List<Site> getSites();

}