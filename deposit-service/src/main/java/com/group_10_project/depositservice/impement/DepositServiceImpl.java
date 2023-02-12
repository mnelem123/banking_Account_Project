package com.group_10_project.depositservice.impement;

import com.group_10_project.depositservice.dto.CustomerDto;
import com.group_10_project.depositservice.dto.DepositDto;
import com.group_10_project.depositservice.dto.ResponseDto;
import com.group_10_project.depositservice.model.Deposit;
import com.group_10_project.depositservice.repository.DepositRepository;
import com.group_10_project.depositservice.service.DepositService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class DepositServiceImpl implements DepositService {
    @Autowired
    private DepositRepository depositRepository;
    private RestTemplate restTemplate;

    public Deposit saveDeposit(Deposit deposit){
        return depositRepository.save(deposit);
    }

    public ResponseDto getDeposit(Long depositId){
        ResponseDto responseDto = new ResponseDto();
        Deposit deposit = depositRepository.findById(depositId).get();
        DepositDto depositDto = mapToDeposit(deposit);

        ResponseEntity<CustomerDto> responseEntity = restTemplate
                .getForEntity("http://localhost:2022/customers/" +deposit.getCustomerId(), CustomerDto.class);

        CustomerDto customerDto = responseEntity.getBody();
        System.out.println(responseEntity.getStatusCode());

        responseDto.setDeposit(depositDto);
        responseDto.setCustomer(customerDto);

        return responseDto;
    }
    private DepositDto mapToDeposit(Deposit deposit){
        DepositDto depositDto = new DepositDto();
        depositDto.setDeposit_Id(deposit.getDeposit_Id());
        depositDto.setDate(deposit.getDate());
        depositDto.setAmount(deposit.getAmount());
        return depositDto;
    }
}
