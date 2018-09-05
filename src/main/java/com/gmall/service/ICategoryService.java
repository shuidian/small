package com.gmall.service;

import com.gmall.common.ServerResponse;

public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse setCategory(Integer categoryId, String categoryName);
}
