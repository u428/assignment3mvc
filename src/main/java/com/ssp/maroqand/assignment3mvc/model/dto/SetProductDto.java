package com.ssp.maroqand.assignment3mvc.model.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Data
public class SetProductDto {

    private String name;

    private String description;

    private double price;

    private Long categoryId;

    private List<MultipartFile> files;

}
