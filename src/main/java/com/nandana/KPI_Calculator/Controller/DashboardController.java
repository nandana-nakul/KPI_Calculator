package com.nandana.KPI_Calculator.Controller;

import com.nandana.KPI_Calculator.Service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

}
