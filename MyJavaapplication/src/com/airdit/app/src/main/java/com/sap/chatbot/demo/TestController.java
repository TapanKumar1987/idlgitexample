package com.sap.chatbot.demo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sap.chatbot.excel.util.Customer;
import com.sap.chatbot.excel.util.CustomerRepository;
import com.sap.chatbot.excel.util.ExcelGenerator;


@RequestMapping("/api/customers")
@Controller
public class TestController {
	@Autowired
    CustomerRepository customerRepository;
 
    @GetMapping(value = "/download/customers.xlsx")
    public ResponseEntity <InputStreamResource> excelCustomersReport() throws IOException {
    	//ResponseEntity<InputStreamResource>
        List customers = (List) customerRepository.getAll();
        System.out.println(customers.size()+"no lenthjujjj");
        System.out.println(((Customer)customers.get(0)).getName()+"no data");
		
		ByteArrayInputStream in = ExcelGenerator.customersToExcel(customers);
		// return IOUtils.toByteArray(in);
		
		HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=customers.xlsx");
		
		 return ResponseEntity
	                .ok()
	                .headers(headers)
	                .body(new InputStreamResource(in));
}
	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
}
