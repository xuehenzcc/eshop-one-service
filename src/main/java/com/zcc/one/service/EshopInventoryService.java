/**
 * 版权：zcc
 * 作者：c0z00k8
 * @data 2018年7月11日
 */
package com.zcc.one.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zcc.one.service.fallback.EshopInventoryServiceFallback;

/**
 * @author c0z00k8
 *
 */
@FeignClient(value="eshop-inventory-service",fallback=EshopInventoryServiceFallback.class)
public interface EshopInventoryService {

	@RequestMapping(value = "/product-inventory/findByProductId",method = RequestMethod.GET)
    String findByProductId(@RequestParam(value = "productId") Long productId);
	
} 
