package com.mockcompany.webapp.service;

import com.mockcompany.webapp.data.ProductItemRepository;
import com.mockcompany.webapp.model.ProductItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class SearchService {

    private final ProductItemRepository productItemRepository;

    @Autowired
    public SearchService(ProductItemRepository productItemRepository) {
        this.productItemRepository = productItemRepository;
    }

    public Collection<ProductItem> search(String query) {
        /*
         * This is a simple implementation that loops over all the items and does the filtering in Java.
         * A better implementation would do most if not all of the filtering in a query and then finalize or
         * rank the results in Java.  From the SearchControllerSpec, we need to meet the following requirements:
         *   1. query can be contained within either the name or description of the item
         *   2. query string is treated as case-insensitive meaning Hi will match hi, hI, Hi, or HI
         *   3. If the query is wrapped in quotes, only EXACT matches of name/description will be returned
         */
       
        
        return Collections.emptyList();
    
    }
}
