package com.haseoshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ItemController {
	
	@GetMapping(value = "/admin/item/new")
    public String itemForm(){
        return "item/itemForm";
    }
}
