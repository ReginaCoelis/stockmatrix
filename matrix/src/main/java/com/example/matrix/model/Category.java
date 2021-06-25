package com.example.matrix.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    int catId;
    String catName;
    @OneToMany
    List<SubCategory> subCategoryList = new ArrayList<>();
}
