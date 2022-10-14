package com.ecommerce.init.Service;

import com.ecommerce.init.DTO.ItemDTO;
import com.ecommerce.init.Entities.Items;
import com.ecommerce.init.Respository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<ItemDTO> getAllItems() {
        return (itemRepository
                .findAll())
                .stream()
                .map(this::convertDataIntoDTO)
                .collect(Collectors.toList());
    }
    // create convertDataIntoDTO() method that returns UserLocationDTO
    private ItemDTO convertDataIntoDTO (Items itemData) {

        ItemDTO dto = new ItemDTO();
        dto.setItemId(itemData.getItemId());
        dto.setItemName(itemData.getItemName());
        dto.setItemPrice(itemData.getItemPrice());
//        dto.setReviews(itemData.getReviews());
        dto.setRating(itemData.getRating());

        return dto;
    }
}
