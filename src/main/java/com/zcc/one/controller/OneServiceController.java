/**
 * 版权：zcc
 * 作者：c0z00k8
 * @data 2018年7月11日
 */
package com.zcc.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zcc.one.service.EshopInventoryService;
import com.zcc.one.service.EshopPriceService;

/**
 * @author c0z00k8
 *
 */
@Controller
@RequestMapping("/one")
public class OneServiceController {

	@Autowired
	private EshopPriceService priceService;
	@Autowired
	private EshopInventoryService inventoryService;
	
	@RequestMapping("/findInventoryByProductId")
	@ResponseBody
	public String findInventoryByProductId(Long productId) {
		return inventoryService.findByProductId(productId);
	} 
	
	@RequestMapping("/findPriceByProductId")
	@ResponseBody
	public String findPriceByProductId(Long productId){
		return priceService.findByProductId(productId);
	}
	
}
