package com.ramjava.empleado.servicio.service;

import com.ramjava.empleado.servicio.dto.EmpleadoResponse;
import com.ramjava.empleado.servicio.entity.Empleado;
import com.ramjava.empleado.servicio.repo.EmpleadoRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepo employeeRepo;

    //@Autowired
    //private ModelMapper modelMapper;

    //@Autowired
    //private WebClient webClient;

//    @Autowired
//    private RestTemplate restTemplate;

    //@Value("${addressservice.base.url}")
    //private String addressBaseUrl;

    /*
     * public EmployeeService(@Value("${addressservice.base.url}")String
     * addressBaseUrl, RestTemplateBuilder builder) { //System.out.println("uri " +
     * addressBaseUrl); // Initialize RestTemplate this.restTemplate = builder
     * .rootUri(addressBaseUrl) .build();
     *
     * }
     */

    // Database call
    public Empleado getEmployeeById(int id) {
    //public EmpleadoResponse getEmployeeById(int id) {

        // addressResponse -> set data by making a REST API call
        //AddressResponse addressReponse = new AddressResponse();

        // empleado -> EmpleadoResponse
        Empleado emp = employeeRepo.findById(id).get();
        return emp;
        // Use ModelMapper instead of manually adding EmployeeResponse object
        //EmpleadoResponse empResponse = modelMapper.map(emp, EmpleadoResponse.class);
        // RestTemplate call --- Block the code flow until the response is received.
        //AddressResponse addressReponse = restTemplate.getForObject("/address/{id}", AddressResponse.class, id);
        // Asynchronous call using WebClient, replacing RestTemplate which is blocking by nature
//        AddressResponse addressReponse = webClient
//                .get()
//                .uri("/address/" + id)
//                .retrieve()
//                .bodyToMono(AddressResponse.class)
//                .block();
//        empResponse.setAddressResponse(addressReponse);

        /*
         * EmployeeResponse empResponse = new EmployeeResponse();
         * empResponse.setId(emp.getId()); empResponse.setName(emp.getName());
         * empResponse.setEmail(emp.getEmail());
         * empResponse.setBloodGroup(emp.getBloodGroup());
         */

        //return empResponse;
    }

    /*
     * private AddressResponse callingAddressServiceUsingRestTemplate(int id) {
     * return restTemplate.getForObject("/address/{id}", AddressResponse.class, id);
     * }
     */
}
