package com.example.matrix.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubCategory {
    @Id
    int subCatId;
    String subCatName;
    @ManyToOne
    Category category;
}
