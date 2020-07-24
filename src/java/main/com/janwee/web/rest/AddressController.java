package com.janwee.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janwee.entity.Address;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController extends AbstractController<Address, Long> {
}
