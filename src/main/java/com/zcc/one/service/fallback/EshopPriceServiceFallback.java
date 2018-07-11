/**
 * 版权：zcc
 * 作者：c0z00k8
 * @data 2018年7月11日
 */
package com.zcc.one.service.fallback;

import org.springframework.stereotype.Component;

import com.zcc.one.service.EshopPriceService;

/**
 * @author c0z00k8
 *
 */
@Component
public class EshopPriceServiceFallback implements EshopPriceService{

	@Override
	public String findByProductId(long productId) {
		return "网络连接超时，自动降级了，请稍后重试···";
	}

}
