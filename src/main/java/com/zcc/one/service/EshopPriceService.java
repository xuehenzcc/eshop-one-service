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

import com.zcc.one.service.fallback.EshopPriceServiceFallback;

/**
 * @author c0z00k8
 *
 */
@FeignClient(value="eshop-price-service",fallback=EshopPriceServiceFallback.class)
public interface EshopPriceService {

	@RequestMapping(value="/product-price/findByProductId",method=RequestMethod.GET)
	String findByProductId(@RequestParam(value="productId") long productId);
	
	
//	@FeignClient(value="eshop-product-service",fallback=ProductServiceFallback.class)
//	public interface ProductService {
//
//		@RequestMapping(value = "/brand/findById",method = RequestMethod.GET)
//	    String findBrandById(@RequestParam(value = "id") Long id);
}
