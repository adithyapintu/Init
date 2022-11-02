package com.ecommerce.init.Service;

import com.ecommerce.init.DTO.ItemDTO;
import com.ecommerce.init.DTO.SingleItemDTO;
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

    public SingleItemDTO getItem(int id){
        Items item = itemRepository.findById(id);

        SingleItemDTO singleItemDTO = convertIntoSingle(item) ;
        return  singleItemDTO;
    }

    private SingleItemDTO convertIntoSingle(Items item) {
        SingleItemDTO itemDto = new SingleItemDTO();
        itemDto.setItemId(item.getItemId());
        itemDto.setItemsSold(item.getItemSold());
        itemDto.setItemName(item.getItemName());
        itemDto.setItemPrice(item.getItemPrice());
        itemDto.setRating(item.getRating());

        return itemDto;
    }

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
