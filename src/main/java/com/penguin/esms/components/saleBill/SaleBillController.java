package com.penguin.esms.components.saleBill;

import com.penguin.esms.components.saleBill.dto.SaleBillDTO;
import com.penguin.esms.components.staff.StaffEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping(path = "sale")
@RequiredArgsConstructor
@Getter
@Setter
public class SaleBillController {
    private final SaleBillService saleBillService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> post(@RequestBody SaleBillDTO dto, Principal connectedUser) {
        StaffEntity staff = (StaffEntity) ((UsernamePasswordAuthenticationToken) connectedUser).getPrincipal();
        return ResponseEntity.ok(saleBillService.post(dto, staff));
    }
}
