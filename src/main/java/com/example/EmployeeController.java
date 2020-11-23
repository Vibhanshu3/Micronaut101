package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    @Inject
    private EmployeeRepository employeeRepository;

    @Get("/")
    public List<Employees> getEmp() {
        return (List<Employees>) this.employeeRepository.findAll();
    }

    @Get("/{id}")
    public Optional<Employees> getEmpById(@PathVariable long id) {
        return this.employeeRepository.findById(id);
    }

    @Post("/save-emp")
//    @Consumes(MediaType.APPLICATION_XML)
    public HttpResponse<Employees> createEmp(@Body Employees employees) {
        try {
            LOG.info(employees.toString());
            LOG.info("in post controller");
            Employees _emp = this.employeeRepository.save(employees);
            return HttpResponse.ok(_emp);
        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
            return HttpResponse.notFound();
        }
//        return  HttpResponse.ok();
    }
}
