package com.application;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.model.LoanRequest;

@RestController
//@RequestMapping("/LoanEngine")
public class LoanController {

	@PostMapping("/loan/request")
	public void requestLaon(@RequestBody final LoanRequest loanRequest) {
		System.out.println(loanRequest);
	}
}
