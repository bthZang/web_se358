package com.penguin.esms.components.supplier;

import com.penguin.esms.components.supplier.dto.SupplierDTO;
import com.penguin.esms.mapper.DTOtoEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SupplierService {
    private final SupplierRepo supplierRepo;
    private final DTOtoEntityMapper mapper;
}
