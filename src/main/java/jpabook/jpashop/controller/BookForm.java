package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {

    // Item
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    // Book
    private String author;
    private String isbn;
}
