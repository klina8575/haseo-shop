package com.haseoshop.repository;

import com.haseoshop.dto.ItemSearchDto;
import com.haseoshop.dto.MainItemDto;
import com.haseoshop.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import com.haseoshop.dto.MainItemDto;

public interface ItemRepositoryCustom {
//	Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
	
    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}
